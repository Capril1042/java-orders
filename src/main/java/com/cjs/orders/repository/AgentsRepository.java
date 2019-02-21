package com.cjs.orders.repository;

import com.cjs.orders.models.Agents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agents, Long>
{
}
