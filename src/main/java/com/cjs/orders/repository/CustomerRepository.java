package com.cjs.orders.repository;

import com.cjs.orders.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    @Query(value = "SELECT c.custname as customer, o.ordnum, o.advanceamount, o.ordamount, o.orddescription, o.agentcode FROM orders o , customer  c WHERE o.custcode = c.custcode ORDER BY c.custname", nativeQuery = true)
    List<Object[]> customersWithOrders();

}
