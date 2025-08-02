/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeno;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class PrimeNo 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int num=sc.nextInt();
      boolean isPrime = true;
      for (int i = 2; i <= num / 2; ++i) 
      {
      // condition for nonprime number
        if (num % i == 0) 
        {
           isPrime = false;
           break;
        }
      }

      if (isPrime)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
    }
    
}
