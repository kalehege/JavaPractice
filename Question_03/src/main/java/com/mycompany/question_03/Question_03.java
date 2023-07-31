package com.mycompany.question_03;

//to handle input and output operations
//.file is to access files
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Question_03 
{

    public static void main(String[] args) 
    {
        try
        {
          File file=new File("newfile.txt");
          Scanner sc=new Scanner(file);
          
          while(sc.hasNextLine())
          {
              String line=sc.nextLine();
              System.out.println(line);
          }
          sc.close();
                 
        }
        catch(FileNotFoundException er)
        {
            System.out.println("Error: file not found\n\n"+er); 
        }
        
    }
}
