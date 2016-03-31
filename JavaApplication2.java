/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {

    public static void main(String[] args) {
   int a=0,b=0,hasil=1,c,hasiljumlah=0,y=0;
   int jumlah[] = new int[10];
   Scanner input = new Scanner (System.in);
   System.out.print ("Masukan Deret Fibonacci  : ");
        c = input.nextInt ();
        for(int i=1; i<=c; i++){           
    a=b;
    b=hasil;
    jumlah[i] = hasil;
    hasil=a+b;
    y++;
    }
    for(int i=y; i>0; i--){
        System.out.print(jumlah[i]+" ");
      } 
    }
