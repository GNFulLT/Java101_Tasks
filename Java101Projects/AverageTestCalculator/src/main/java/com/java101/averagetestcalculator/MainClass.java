package com.java101.averagetestcalculator;

import java.util.Scanner;

//	Java101 www.patika.dev

public class MainClass {
	public static void main(String[] args)
	{
		//! Create the Scanner
		Scanner scn = new Scanner(System.in);
		int turkce, mat, biyo, fizik,tarih,muzik;

		//! Get Inputs
		System.out.println("Türkçe Notunuz : ");
		turkce = scn.nextInt();

		System.out.println("Matematik Notunuz : ");
		mat = scn.nextInt();

		System.out.println("Biyoloji Notunuz : ");
		biyo = scn.nextInt();
		
		System.out.println("Fizik Notunuz : ");
		fizik = scn.nextInt();

		System.out.println("Tarih Notunuz : ");
		tarih = scn.nextInt();

		System.out.println("Müzik Notunuz : ");
		muzik = scn.nextInt();

		int toplam = (turkce + mat + biyo + fizik + tarih + muzik);

		int ortalama = (toplam >> 1)/3;
		System.out.println(String.format("Ortalamanız : %d",ortalama));

		System.out.println(ortalama > 60 ? "Geçtin" : "Kaldın");
	}
}
