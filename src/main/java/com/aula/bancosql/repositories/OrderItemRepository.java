package com.aula.bancosql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.bancosql.domain.OrderItem;
import com.aula.bancosql.domain.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
