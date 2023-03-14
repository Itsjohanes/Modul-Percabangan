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
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       byte monthNum = sc.nextByte();
       String monthName="";
       switch(monthNum){
          case 1: monthName = "January";break; case 2: monthName = "February";break;
          case 3: monthName = "March";break; case 4: monthName = "April";break;
          case 5: monthName = "May";break; case 6: monthName = "June";break;
          case 7: monthName = "July";break; case 8: monthName = "August";break;
          case 9: monthName = "September";break; case 10: monthName = "October";break;
          case 11: monthName = "November";break; default: monthName="December";break;
       }
       System.out.println(monthName);

    }
    
}
