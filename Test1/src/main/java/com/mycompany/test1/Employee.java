package com.mycompany.test1;
public class Employee 
{
    private int age;
    private String name;
    private float salary;
    //getter setter method
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }
    public void setSalary(float s)
    {
        salary=s;
    }
    public float getSalary()
    {
        return salary;
    }

    //constructor method
    public Employee()
    {
        name="Chamod";
        age=22;
        salary=30000.00f;
    }
    public void display()
    {
        System.out.println("Name= "+name);
        System.out.println("Age= "+age);
        System.out.println("Salary= "+salary);
    }
    
}
