package com.mycompany.extensionofpractical05;
public class SavingsAccount extends BankAccount
{
      @Override
    public double calculateInterest()
    {
         double i=getBalance()*1.2;
         return i;
    }
    
}
