package com.mycompany.extensionofpractical05;
public class CheckingAccount extends BankAccount
{
    @Override
    public double calculateInterest()
    {
         double i=getBalance()*0.2;
         return i;
    }

}
