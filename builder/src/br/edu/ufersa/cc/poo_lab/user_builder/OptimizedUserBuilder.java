package br.edu.ufersa.cc.poo_lab.user_builder;

import br.edu.ufersa.cc.poo_lab.models.User;

public class OptimizedUserBuilder implements UserBuilder {

    private User user;

    @Override
    public UserBuilder reset() {
        user = new User();
        return this;
    }

    @Override
    public UserBuilder setName(String name) {
        user.setName(name);
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    @Override
    public UserBuilder setPhone(String phone) {
        user.setPhone(phone);
        return this;
    }

    @Override
    public User build() {
        return user;
    }

}
