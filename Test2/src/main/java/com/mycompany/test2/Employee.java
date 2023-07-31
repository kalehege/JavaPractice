package com.mycompany.test2;
public class Employee 
{
    private String name;
    private double salary;
    private double bonus;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    { 
        return salary;
    }
    public Employee()
    {
        bonus=10000.00;
    }
    public void display()
    {
        System.out.println("Bonus= "+bonus); 
    }
    public double BonusAmount()
    {
        return salary+bonus;
    }
}
