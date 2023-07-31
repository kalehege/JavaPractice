package com.mycompany.practical05extension_2;
public class Circle implements Shape
{
   private double radius;
   public void setRadius(double radius)
   {
       this.radius=radius;
   }
   public double getRadius()
   {
       return radius;
   }
   @Override
   public double calculateArea()
   {
       double a=Math.PI*radius*radius;
       return a;
   }
   @Override 
   public double calculatePerimeter()
   {
       double p=(2*Math.PI*radius) + (2*radius);
       return p;
   }
   public Circle(double radius)
   {
       this.radius=radius;
   }
}
