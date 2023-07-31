package com.mycompany.question_01;
import java.util.Scanner;
public class Question_01 
{

    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int no1,no2;
        float ans;
        try
        {  
            System.out.print("Enter first number:");
            no1=ob.nextInt();
            System.out.print("Enter second number:");
            no2=ob.nextInt();
        
            ans=(float)no1/no2;
            System.out.println("Answer= "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: a number cannot be divided by zero");
        }
    }
}
