package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
static int awal,beda,banyak,deretke;
  
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);


    int mode=0;
    boolean loop = true;
    while (loop = true)
    {
    System.out.println("Ekemitsu Fibonacci Mode :");
    System.out.println("Remember to Always Have Good Game and Well Played");
    System.out.println("1. Fibonacci");
    System.out.println("2. Fibonacci Row Sum ");

    System.out.print("Select Mode:");
    mode = a.nextInt();


    if (mode == 1 || mode == 2){break;}
        }
    if (mode == 1){
    System.out.print("Input Row :");
    banyak = a.nextInt();

     int n=banyak;
             for (int i=1;i<=banyak;i++){
                 System.out.print(fibbonacci(i)+" ");

    }
        }
    if (mode == 2){
    System.out.print("1st Row       :");
    awal = a.nextInt();
    System.out.print("Row Different :");
    beda = a.nextInt();
    System.out.print("Row Amount    :");
    banyak = a.nextInt();

    int deret[]= new int [banyak];

            tampilderet(deret, awal, beda);

            System.out.print("Amount Row : "+jumlahderet(deret));

            System.out.println("");

            do
            {

            System.out.println("");
            System.out.println("++++++++++++++++++++++++++++");

            System.out.print("Row : ");
            deretke=a.nextInt();

            try {
            System.out.println("Value : "+deret[deretke-1]);
            }
            catch (Exception salah){
                System.out.println("Data Not Found Sossy Kiddo !");
            }

            }
            while (loop==true);

        }
    }
     public static int fibbonacci(int x){
             if (x<=0 || x<=1){
                 return x;
             }
             else{
                 return fibbonacci(x-2)+fibbonacci(x-1);
             }
         }

    
 static int[] tampilderet (int array[], int a, int b){

        for (int i=0; i<array.length ; i++)
        {

            array[i]= a;
            System.out.print(a+",");
            a+=b;
        }

        System.out.println("");

        return array;

    }


    static int jumlahderet (int array[]){

        int jumlah=0;
        for (int i=0; i < array.length;i++)
        {
            jumlah+=array[i];
        }

        return jumlah;    }  
 }
