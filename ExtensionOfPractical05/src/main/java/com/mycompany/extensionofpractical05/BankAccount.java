package com.mycompany.extensionofpractical05;
abstract class BankAccount 
{
  private int accountNumber;
  private double balance;
  
  public void setAccount( int acc)
  {
      accountNumber=acc;
  }
  public int getAccount()
  {
      return accountNumber;
  }
  public void setBalance(double bal)
  {
     balance=bal; 
  }
  public double getBalance()
  {
      return balance;
  }
  
  public abstract double calculateInterest(); 
}
