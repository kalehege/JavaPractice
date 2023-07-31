package com.mycompany.practical05extension_2;
public class Practical05Extension_2 
{

    public static void main(String[] args) 
    {
        Rectangle o1=new Rectangle(2.0,3.0);
        System.out.println("Area= "+o1.calculateArea());
        System.out.println("Perimeter= "+o1.calculatePerimeter());
        o1.setBreadth(2);
        System.out.println("Area= "+o1.calculateArea());
        System.out.println("Perimeter= "+o1.calculatePerimeter());
        System.out.print("\n");
        
        Circle o2=new Circle(3.0);
        System.out.println("Area= "+o2.calculateArea());
        System.out.println("Perimeter= "+o2.calculatePerimeter());
        o2.setRadius(2);
        System.out.println("Area= "+o2.calculateArea());
        System.out.println("Perimeter= "+o2.calculatePerimeter());
        System.out.print("\n");
        
        Triangle o3=new Triangle(2.0,3.0,6.0,5.0);
        System.out.println("Area= "+o3.calculateArea());
        System.out.println("Perimeter= "+o3.calculatePerimeter());
        o3.setHeight(2);
        System.out.println("Area= "+o3.calculateArea());
        System.out.println("Perimeter= "+o3.calculatePerimeter());
        System.out.print("\n");
        
    }
}
