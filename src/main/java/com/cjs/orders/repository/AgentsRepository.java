package com.cjs.orders.repository;

import com.cjs.orders.models.Agents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentsRepository extends JpaRepository<Agents, Long>
{
    @Query(value = "SELECT a.agentname, a.commission, a.country, a.phone, a.workingarea, a.agentcode, c.custname as customer FROM agents a , customer c WHERE c.agentcode = a.agentcode ORDER BY a.agentname", nativeQuery = true)
    List<Object[]> agentsWithCostumers();

    @Query(value = "SELECT a.agentname, o.ordnum, o.orddescription FROM agents a , orders o WHERE o.agentcode = a.agentcode ORDER BY a.agentname", nativeQuery = true)
    List<Object[]> agentsWithOrderInfo();


}
