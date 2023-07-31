package com.mycompany.item_object;
public class Item
{
    //private too can be used according que
    protected int location;
    protected String description;
    
    //constructor
    //can be done in the normal way we did..assigning 02 new variables
    public Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    
    //getter and setter 
    public void setLoc(int lo)
    {
        location=lo;
    }
    public int getLoc()
    {
        return location;
    }
    public void setDes(String d)
    {
        description=d;
    }
    public String getDes()
    {
        return description;
        
    }
    
}
