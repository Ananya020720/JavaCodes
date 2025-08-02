/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.weekdays;
import java.util.*;
/**
 *
 * @author hp
 */
public class WeekDay 
{
   public static void main(String[] args)
   {
      int choice;
      System.out.println("Enter the Week Day number(1-7):");
      Scanner sc=new Scanner(System.in);
      choice=sc.nextInt();
      switch(choice)
      {
         case 1: System.out.println("Sunday");
                break;
         case 2: System.out.println("Monday");
                break;
         case 3: System.out.println("Tuesday");
                break;
         case 4: System.out.println("Wednesday");
                break;
         case 5: System.out.println("Thursday");
                break;
         case 6: System.out.println("Friday");
                break;
         case 7: System.out.println("Saturday");
                break;
         default: System.out.println("Invalid Case");

      }
      
   }

}