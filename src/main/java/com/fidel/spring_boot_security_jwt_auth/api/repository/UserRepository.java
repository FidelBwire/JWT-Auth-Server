package com.fidel.spring_boot_security_jwt_auth.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fidel.spring_boot_security_jwt_auth.api.entity.User;
import com.fidel.spring_boot_security_jwt_auth.api.entity.UserRole;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
}
