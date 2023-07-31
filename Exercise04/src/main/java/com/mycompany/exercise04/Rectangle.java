package com.mycompany.exercise04;
public class Rectangle extends Shape
{
   private double length,breadth;
   public Rectangle(double length,double breadth)
   {
       this.length=length;
       this.breadth=breadth;
   }
   public double calculateArea()
   {
       double area=length*breadth;
       return area;
   }
}
