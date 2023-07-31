package com.mycompany.practical05extension_2;
public class Rectangle implements Shape
{
    private double height,breadth;
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getheight()
    {
        return height;
    }
    public void setBreadth(double breadth)
    {
        this.breadth=breadth;
    }
    public double getbreadth()
    {
        return breadth;
    }
    
    @Override
    public double calculateArea()
    {
        double a= height*breadth;
        return a;
    }
    @Override
    public double calculatePerimeter()
    {
        double p=2*(height+breadth);
        return p;
    }
    public Rectangle(double height,double breadth)
    {
        this.height=height;
        this.breadth=breadth;
    }
}
