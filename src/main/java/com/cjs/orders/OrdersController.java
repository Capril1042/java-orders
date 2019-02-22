package com.cjs.orders;

import com.cjs.orders.models.Customer;
import com.cjs.orders.models.Orders;
import com.cjs.orders.repository.AgentsRepository;
import com.cjs.orders.repository.CustomerRepository;
import com.cjs.orders.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController()
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrdersController
{
    @Autowired
    AgentsRepository agentrepos;

    @Autowired
    CustomerRepository custrepos;

    @Autowired
    OrdersRepository ordsrepos;


    @GetMapping("/customer/order") // Returns all customers with their orders
    public List<Object[]> customersWithOrders()
    {
        return custrepos.customersWithOrders();
    }

//    @GetMapping("/customer/name/{custname}") // Returns all orders for a particular based on name
//    public List<Orders> findByCustName(@PathVariable String custname)
//    {
//
//    }

    @GetMapping("/customer/order/{custcode}") //Returns all orders for a particular customer based on custcode
    public List<Orders> findByCustcode(@PathVariable long custcode)
    {
        return ordsrepos.findByCustcode(custcode);
    }
    @GetMapping("/agents")// Returns all agents with their customers
    public List<Object[]> agentsWithCostumers()
    {
        return agentrepos.agentsWithCostumers();
    }
    @GetMapping("/agents/orders") // Return a list with the agents name and associated order number and order description
    public List<Object[]> agentsWithOrderInfo()
    {
        return agentrepos.agentsWithOrderInfo();
    }
    @DeleteMapping("/customer/{custcode}") // Deletes a customer based off of their custcode and deletes all their associated orders
    public void deleteCustomer(@PathVariable long custcode)
    {
        custrepos.deleteById(custcode);
    }
///agents/{agentcode} - Deletes an agent if they are not assigned to a customer or order (Stretch Goal)
}
