/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fibonacci;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int a=0,b=1,c,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Fibonacci series:");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Enter a valid size(i.e above 0)");
        }
        else
        {
          System.out.println("The Fibonacci Series of size "+n+"are:");
          System.out.print(a+" ");
          for(i=1;i<n;i++)
          {
            c=a+b;
            System.out.print(b+" ");
            a=b;
            b=c;
            
          }
        }
    }
}
