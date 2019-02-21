package com.cjs.orders.repository;

import com.cjs.orders.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long>
{
}
