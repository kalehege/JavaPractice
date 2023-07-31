package com.mycompany.implemnetationclass2;
public class Politician implements Speaker
{
    
    @Override
    public void speak(String phrase)
    {
        System.out.println("Politician: "+phrase); 
    }
}
