package com.mycompany.test01;
public class Test01 
{

    public static void main(String[] args) {
       Employee o1=new Employee();
       o1.setID(1234);
       o1.setName("Mr.Bogdan");
       o1.setDes("Senior manager");
       
        System.out.println("Employee name= "+o1.getName());
        System.out.println("Employee ID= "+o1.getID());
        System.out.println("Employee designation= "+o1.getDes());
        
        System.out.println("\n");
        
        Employee o2=new Employee();
       o2.setID(4321);
       o2.setName("Ms. Bird");
       o2.setDes("Assistant designer");
       
        System.out.println("Employee name= "+o2.getName());
        System.out.println("Employee ID= "+o2.getID());
        System.out.println("Employee designation= "+o2.getDes());
    }
}
