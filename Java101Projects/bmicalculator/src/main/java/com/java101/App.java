package com.java101;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scn = new Scanner(System.in);
        System.out.println( "Lütfen boyunuzu (metre cinsinde) giriniz : " );
        double boy = scn.nextDouble();
        System.out.println( "Lütfen kilonuzu giriniz : " );
        double kilo = scn.nextDouble();
        System.out.println( String.format("Vücut Kitle İndeksiniz : %.3f",kilo/(boy*boy)) );

    }
}
