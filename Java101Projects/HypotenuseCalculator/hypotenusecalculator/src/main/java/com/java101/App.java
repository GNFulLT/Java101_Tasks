package com.java101;

import java.util.Scanner;

//	Java101 www.patika.dev

public class App 
{
    public static void main( String[] args )
    {
        int a,b;
        double c;
        Scanner scn = new Scanner(System.in);
        System.out.println( "1.kenarı giriniz");
        a = scn.nextInt();
        System.out.println( "2.kenarı giriniz");
        b = scn.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println(String.format("Hipotenüs : %.3f", c));
    }
}
