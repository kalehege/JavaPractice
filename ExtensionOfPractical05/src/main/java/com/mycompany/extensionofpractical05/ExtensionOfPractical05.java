package com.mycompany.extensionofpractical05;
public class ExtensionOfPractical05 
{

    public static void main(String[] args)
    {
        SavingsAccount p1=new SavingsAccount();
        p1.setBalance(20000000.0);
        System.out.println("Interest of savings account="+p1.calculateInterest());
        
        CheckingAccount p2=new CheckingAccount();
        p2.setBalance(1000000.0);
        System.out.println("Interest for checking account="+p2.calculateInterest());
        
    }
}
