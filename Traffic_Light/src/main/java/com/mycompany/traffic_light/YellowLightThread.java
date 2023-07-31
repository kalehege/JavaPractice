package com.mycompany.traffic_light;
public class YellowLightThread extends Thread
{
    public void run()
    {
    try
    {
        while(true)
        {
        System.out.println("Yellow Light");
        Thread.sleep(2000);
    }
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
        
}
}