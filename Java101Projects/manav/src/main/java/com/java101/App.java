package com.java101;

import java.util.Scanner;

//	Java101 www.patika.dev

public class App 
{
    public static void main( String[] args )
    {
        Scanner scn = new Scanner(System.in);



        System.out.println( "Armut sayısı : " );
        int armut = scn.nextInt();
        System.out.println( "Elma sayısı : " );
        int elma = scn.nextInt();
        System.out.println( "Domates sayısı : " );
        int domates = scn.nextInt();
        System.out.println( "Muz sayısı : " );
        int muz = scn.nextInt();
        System.out.println( "Patlıcan sayısı : " );
        int patlican = scn.nextInt();
        System.out.println(String.format("Toplam : %.3f",2.14f*armut+3.67f*elma+1.11*domates+0.95f*muz+5.f*patlican) );
        
    }
}
