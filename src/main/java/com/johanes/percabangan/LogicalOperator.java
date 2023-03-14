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
public class LogicalOperator {
    public static void main(String[] args){
        boolean a= true, b=false, c=true;
        System.out.println(a&&b); //false
        System.out.println(b&&c); //false
        System.out.println(a||b); // true
        System.out.println(!a||!b); //true
        System.out.println(!a||b); //false
        System.out.println((a&&b)||(!b&&c)); //true
        System.out.println((!a||!b)&&(a||!b)||(b&&a&&!c)); //true
        System.out.println(!(a&&b));//true
        System.out.println(b&&!a); //false
        System.out.println(!b&&(b||(a&&!c))); //false

    }
}
