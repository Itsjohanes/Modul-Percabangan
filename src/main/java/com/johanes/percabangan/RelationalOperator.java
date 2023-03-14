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
public class RelationalOperator {
    
    public static void main(String[] args){
        int a=10, b=20, c=30, d=40, e=50;

        System.out.println(a==b); // 10 = 20? false 
        System.out.println(a!=b); // 10 != 20? true
        System.out.println(a<b); //10<20? true
        System.out.println(c>d); //30>40?false
        System.out.println(d>=a); //40 >= (lebih besar atau sama dengan) 10? true
        System.out.println(a<=b); //10 <= (lebih kecil atau ama dengan ) 20? true
        System.out.println((a+b)*c<(b-c)*d); // 900 < -500? false 
        System.out.println((a-b)*3==7); // -30 = 7?  false
        System.out.println((a+b) * (a*c)!=e*d); // 30 * 300 != 2000? true
        
    }
    
}
