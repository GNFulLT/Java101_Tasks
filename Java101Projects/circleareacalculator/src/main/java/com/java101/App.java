package com.java101;

import java.util.Scanner;

//	Java101 www.patika.dev

public class App 
{
    private static final double PI = 3.14;
    public static void main( String[] args )
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Çemberin yarı çapını giriniz : ");

        int r = scn.nextInt();

        double alan = PI*r*r;
        double cevre = 2*PI*r;


        System.out.println(String.format("Çemberin alanı : %.3f\nÇemberin çevresi : %.3f", alan,cevre));
    }
}
