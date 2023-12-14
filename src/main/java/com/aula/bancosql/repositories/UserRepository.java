package com.aula.bancosql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.bancosql.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
