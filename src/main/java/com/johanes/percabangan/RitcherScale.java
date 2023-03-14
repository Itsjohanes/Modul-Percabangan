/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.percabangan;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class RitcherScale {
       public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double scale = sc.nextDouble();
      char category;
      if(scale >= 8.0) category = 'A';
      else if(scale >= 7.0)  category = 'B';
      else if(scale >= 6.0) category = 'C';
      else if(scale >= 4.5) category = 'D';
      else category = 'E';
      System.out.println(category);
   }

}
