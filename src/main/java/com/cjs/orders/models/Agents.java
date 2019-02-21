package com.cjs.orders.models;

import javax.persistence.*;

@Entity
@Table(name="agents")
public class Agents
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="agentcode")
    private long id;

    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;

    public Agents()
    {

    }

    public long getId()
    {
        return id;
    }

    public String getAgentname()
    {
        return agentname;
    }

    public void setAgentname(String agentname)
    {
        this.agentname = agentname;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
