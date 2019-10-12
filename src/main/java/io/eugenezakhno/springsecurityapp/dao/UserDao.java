package io.eugenezakhno.springsecurityapp.dao;

import io.eugenezakhno.springsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
