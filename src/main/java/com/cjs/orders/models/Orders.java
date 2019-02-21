package com.cjs.orders.models;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordnum;

    private double ordamount;
    private double advanceamount;

    @ManyToOne
    @JoinColumn(name= "custcode", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name= "agentcode", nullable = false)
    private Agents agents;

    private String orddescription;

    public Orders()
    {
    }

    public long getOrdnum()
    {
        return ordnum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public String getOrddescription()
    {
        return orddescription;
    }

    public void setOrddescription(String orddescription)
    {
        this.orddescription = orddescription;
    }
}
