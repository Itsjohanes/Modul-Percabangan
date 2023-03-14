/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.percabangan;

/**
 *
 * @author acer
 */
public class LogicalOperator2 {
    public static void main(String[] args){
        int pH=100, humidity=19;

        System.out.println((pH==100)&&(humidity<20)); //true
        System.out.println((pH*humidity>pH/humidity)&&(humidity%2==0)); //false
        System.out.println((pH!=0)&&(humidity>19)); // false
        System.out.println((pH*0<0)&&(humidity*-1>=0)); //false
        System.out.println((pH*0<0)||!(humidity*-1>=0)); //true
        System.out.println((pH/pH!=1)||(humidity/pH>0)); //false
        System.out.println((pH/pH!=1)||(humidity/pH>=0)); //true

    }
    
}
