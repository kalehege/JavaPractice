package com.mycompany.traffic_light;
public class GreenLightThread extends Thread
{
    public void run()
    {
    try
    {
        while(true)
        {
        System.out.println("Green Light");
        Thread.sleep(10000);
    }
    }
    catch(InterruptedException e)
    {
         e.printStackTrace();
    }
       
    }
}
