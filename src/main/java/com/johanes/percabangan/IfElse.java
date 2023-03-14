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
public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tea = sc.nextInt();
        if (tea%2==1){
        tea /= 2;
        }
        else{
            tea*=2;
        }
        System.out.println(tea);
}
}



