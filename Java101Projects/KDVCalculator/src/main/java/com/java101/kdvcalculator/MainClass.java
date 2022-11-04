package com.java101.kdvcalculator;

import java.util.Scanner;

//	Java101 www.patika.dev
public class MainClass {
    public static void main(String[] args) {
        float tutar,KDV = 0.18f;
        Scanner scn =new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz");
        tutar = scn.nextFloat();

        float kdvTutar = tutar * KDV;
        float kdvliTutar = tutar + kdvTutar;
        System.out.println(String.format("KDV'siz Tutar : %f", tutar));
        System.out.println(String.format("KDV Oranı : %f", KDV));
        System.out.println(String.format("KDV Tutar : %f", kdvTutar));
        System.out.println(String.format("KDV'li Tutar : %f", kdvliTutar));

    }
}
