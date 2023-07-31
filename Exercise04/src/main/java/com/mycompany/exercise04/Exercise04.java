package com.mycompany.exercise04;
public class Exercise04 
{

    public static void main(String[] args) 
    {
        Circle o1=new Circle(56.89);
        System.out.println("Area= "+o1.calculateArea());
        o1.display();
        
        Rectangle o2=new Rectangle(5,4);
        System.out.println("Area= "+o2.calculateArea());
        o2.display();
    }
}
