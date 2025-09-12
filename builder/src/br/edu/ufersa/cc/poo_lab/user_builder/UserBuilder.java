package br.edu.ufersa.cc.poo_lab.user_builder;

import br.edu.ufersa.cc.poo_lab.models.User;

public interface UserBuilder {

    UserBuilder reset();

    UserBuilder setName(String name);

    UserBuilder setEmail(String email);

    UserBuilder setPhone(String phone);

    User build();

}
