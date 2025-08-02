/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.minutestoyears;
import java.util.*;
/**
 *
 * @author hp
 */
public class MinutesToYears {
    
  public static void main(String[] args){
       
      Scanner sc=new Scanner(System.in);
      int mins=sc.nextInt();
      int year, day;
      year=mins/(60*24*365);
      mins-=year*60*24*365;
      day=mins/(60*24);
      System.out.println(mins+" minutes is approximately "+year+" years and "+day+" days\n");
  }   
}