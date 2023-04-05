/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ridha150323;

import java.util.Scanner;

/**
 *
 * @author ridha
 */
public class perulangan {
    public static void main(String[] args){
		double diskon,total,biaya;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Belanja = ");
		biaya=input.nextDouble();
		
		if(biaya>=100000){
			diskon=0.1*biaya;
			total=biaya-diskon;
			System.out.println("Diskon yang Didapatkan Adalah : "+diskon);
			System.out.println("Total yang dibayar adalah : "+total);
			
		}
		else{
			System.out.println("Anda tidak mendapatkan Diskon");
			System.out.println("Total yang dibayar adalah : "+biaya);			
		}
	}
}
