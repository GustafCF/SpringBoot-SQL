package com.aula.bancosql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.bancosql.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
