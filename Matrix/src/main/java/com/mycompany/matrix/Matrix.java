/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Matrix {
    public static void main(String...args) {
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter number of rows in matrix1 : "); 
           int row1 = sc.nextInt();
           System.out.println("Enter number of columns in matrix1 : ");
           int col1 = sc.nextInt();
           System.out.println("Enter number of rows in matrix2 : "); 
           int row2 = sc.nextInt();
           System.out.println("Enter number of columns in matrix2 : ");
           int col2 = sc.nextInt();
           int[][] matrix1 = new int[row1][col1];
           int[][] matrix2 = new int[row2][col2];
           
           System.out.println("Enter the elements in first matrix :");
           for (int i = 0; i < row1; i++) {
                  for (int j = 0; j < col1; j++) {
                        matrix1[i][j] = sc.nextInt();
                  }
           }
           System.out.println("Enter the elements in second matrix :");
           for (int i = 0; i < row2; i++) {
                  for (int j = 0; j < col2; j++) {
                        matrix2[i][j] = sc.nextInt();
                  }
           }
           
           
           //addition of matrices.
           if(row1==row2&&col1==col2)
           {
           int[][] addMatrix = new int[row1][col1];
           for (int i = 0; i < row1; i++) {
                  for (int j = 0; j < col1; j++) {
                        addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                  }
           }
           System.out.println("The sum of the two matrices is : ");
           for (int i = 0; i < row1; i++) {
                  for (int j = 0; j < col1; j++) {
                        System.out.print(addMatrix[i][j] + " ");
                  }
                  System.out.println();
           }
           }
           else
               System.out.println("Matrix addition not possible");
           
           
           //Multiplication of matrices
           if(col1==row2)
           {
           int[][] productMatrix  = new int[row1][col2];
            for (int i = 0; i < row1; i++) 
            {
               for (int j = 0; j < col2; j++) 
               {
                  for (int k = 0; k < col2; k++) 
                  { 
                    productMatrix[i][j] = productMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                  }
                }
            }
            System.out.println("The product of the two matrices is : ");
            for (int i = 0; i < row1; i++) 
            {
                  for (int j = 0; j < col2; j++) {
                        System.out.print(productMatrix[i][j] + " ");
                  }
                  System.out.println();
            }
        }
    }
}

    
