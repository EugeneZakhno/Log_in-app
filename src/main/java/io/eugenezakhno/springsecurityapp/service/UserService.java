package io.eugenezakhno.springsecurityapp.service;

import io.eugenezakhno.springsecurityapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
