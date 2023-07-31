package com.mycompany.test1;
public class Test1
{

    public static void main(String[] args) 
    {
      Employee o=new Employee();
      o.setName("Chamod");
        System.out.println("Employee name= "+o.getName());
        o.setAge(25);
        System.out.println("Age= "+o.getAge());
        o.setSalary(25000.00f);
        System.out.println("Salary= "+o.getSalary());
        System.out.println("\n");
        
        Employee o2=new Employee();
        o2.display();
    }
}
