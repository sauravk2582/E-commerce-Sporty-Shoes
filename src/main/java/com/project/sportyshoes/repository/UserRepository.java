package com.project.sportyshoes.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.sportyshoes.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User>findUserByEmail(String email);
}