package com.mycompany.que_04_continue;
public class Que_04_continue 
{

    public static void main(String[] args) 
    {
              int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers )
      {
         if( x == 30 )
         {
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.println("I'm out of the loop");

    }
}
/*10
20
40
50
60
I'm out of the loop
*/
