package com.mycompany.test2;
public class Test2 
{
    public static void main(String[] args) 
    {
        Employee o=new Employee();
        o.setName("Bogdan");
        System.out.println("Name= "+o.getName());
        o.setSalary(50000);
        System.out.println("Basic salary= "+o.getSalary());
        o.display();
        System.out.println("Bonus amount= "+o.BonusAmount());

    }
}
