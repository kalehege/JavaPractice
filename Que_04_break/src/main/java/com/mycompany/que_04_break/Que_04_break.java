package com.mycompany.que_04_break;
public class Que_04_break
{

    public static void main(String[] args) 
    {
        int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers )
      {
         if( x == 30 )
         {
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.println("I'm out of the loop now");

    }
}
/*10
20
I'm out of the loop now
*/