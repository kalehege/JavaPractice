package com.mycompany.testclass3;
public class TestClass3 
{
    public static void main(String[] args) 
    {
        Student o1=new Student();
        o1.setid(1234);
        o1.setname("Sam");
        o1.setcourse("Computer science");
        System.out.println("ID= "+o1.getid());
        System.out.println("Name= "+o1.getname());
        System.out.println("Course= "+o1.getcourse());
        System.out.println("\n");
        
        Lecturer o2=new Lecturer();
        o2.setid(5678);
        System.out.println("ID= "+o2.getid());
        o2.setname("July");
        System.out.println("Name= "+o2.getname());
        o2.setprogramme("Data Science");
        System.out.println("Programme= "+o2.getprogramme());
    }
}
