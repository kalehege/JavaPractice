package com.mycompany.test01;
public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setID(int empID)
    {
        this.empID=empID;
    }
    public int getID()
    {
        return empID;
    }
    public void setName(String empName)
    {
        this.empName=empName;
    }
    public String getName()
    {
        return empName;
    }
    public void setDes(String empDesignation)
    {
        this.empDesignation=empDesignation;
    }
    public String getDes()
    {
        return empDesignation;
    }
}
