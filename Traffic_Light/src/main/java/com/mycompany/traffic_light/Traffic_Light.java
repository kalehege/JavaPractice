package com.mycompany.traffic_light;
public class Traffic_Light 
{

    public static void main(String[] args) 
    {
        RedLightThread t1=new RedLightThread();
        t1.start();
        
        GreenLightThread t2=new GreenLightThread();
        t2.start();
        
        YellowLightThread t3=new YellowLightThread();
        t3.start();
        
       
    }
}
