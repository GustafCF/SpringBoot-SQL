package com.aula.bancosql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.bancosql.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
