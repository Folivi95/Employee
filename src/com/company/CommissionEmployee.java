package com.company;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross Sales Must Be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission Rate Must Be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross Sales Must Be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission Rate Must Be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString()
    {
        return String.format("")
    }
}
