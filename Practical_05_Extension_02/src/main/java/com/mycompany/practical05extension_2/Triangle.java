package com.mycompany.practical05extension_2;
public class Triangle implements Shape
{
   private double height,base,l1,l2;
   public void setHeight(double height)
   {
       this.height=height;
   }
   public double getHeight()
   {
       return height;
   }
   public void setBase(double base)
   {
       this.base=base;
   }
   public double getBase()
   {
       return base;
   }
   public void setl1(double l1)
   {
       this.l1=l1;
   }
   public double getl1()
   {
       return l1;
   }
   public void setl2(double l2)
   {
       this.l2=l2;
   }
   public double getl2()
   {
       return l2;
   }
   @Override
   public double calculateArea()
   {
       double a=0.5*height*base;
       return a;
   }
   @Override
   public double calculatePerimeter()
   {
       double p=l1+l2+base;
       return p;
   }
   
   public Triangle(double height,double base, double l1,double l2)
   {
       this.height=height;
       this.base=base;
       this.l1=l1;
       this.l2=l2;
   }
}
