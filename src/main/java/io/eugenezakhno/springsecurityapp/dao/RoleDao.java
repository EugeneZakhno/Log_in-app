package io.eugenezakhno.springsecurityapp.dao;

import io.eugenezakhno.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
