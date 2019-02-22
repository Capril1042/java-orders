package com.cjs.orders.repository;

import com.cjs.orders.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long>
{
    @Query(value = "SELECT * FROM orders WHERE custcode = :custcode", nativeQuery=true)
    List<Orders> findByCustcode (@Param("custcode") long custcode);

    @Query(value = "SELECT o.* FROM orders o, customer c WHERE c.custname = :custname ", nativeQuery=true)
    List<Orders> findByCustName (@Param("custname") String custname);

}
