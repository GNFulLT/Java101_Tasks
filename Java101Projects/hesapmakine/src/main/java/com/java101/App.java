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

        System.out.println("İlk Sayıyı Giriniz");
        int x1 = scn.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        int x2 = scn.nextInt();

        System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme\n");
        int sec = scn.nextInt();

        switch(sec)
        {
            case 1:
                System.out.println(String.format("%d", x1+x2));
                break;
            case 2: 
                System.out.println(String.format("%d", x1-x2));
                break;
            case 3:
                System.out.println(String.format("%d", x1*x2));
                break;
            case 4:
                System.out.println(String.format("%.3f", (float)x1/(float)x2));
                break;
            default:
                System.out.println("Bilinmeyen Seçenek");
                break;

        }

    }
}
