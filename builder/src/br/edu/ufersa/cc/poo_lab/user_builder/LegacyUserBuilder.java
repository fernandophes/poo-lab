package br.edu.ufersa.cc.poo_lab.user_builder;

import br.edu.ufersa.cc.poo_lab.models.User;

public class LegacyUserBuilder implements UserBuilder {

    private User user = new User();

    @Override
    public UserBuilder reset() {
        user = new User();
        return this;
    }

    @Override
    public UserBuilder setName(String name) {
        user.setName(name.toUpperCase());
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    @Override
    public UserBuilder setPhone(String phone) {
        final var formatted = phone.replaceAll("\\D", "");
        user.setPhone(formatted);
        return this;
    }

    @Override
    public User build() {
        return user;
    }

}
