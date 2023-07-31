package com.mycompany.implemnetationclass2;
public class Lecturer implements Speaker
{
    @Override
  public void speak(String phrase)
  {
      System.out.println("Lecturer: "+phrase);
  }
}
