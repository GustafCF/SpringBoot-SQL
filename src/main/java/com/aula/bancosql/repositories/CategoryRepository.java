package com.aula.bancosql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.bancosql.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
