/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.percabangan;

import java.util.*;
/**
 *
 * @author acer
 */
public class IfStatement {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int length = sc.nextInt();
        if(length < 0){
            length = 0;
        }
        int price  = length * 100;
        System.out.println(price);
            
    }
    
}
