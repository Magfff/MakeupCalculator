package main.java;

import java.util.Scanner;

/**
 * This class contains the main class in which user will be ask to enter product information
 * This application will keep ask user to enter product info unless user force to exit 
 * @author ziqifeng
 *
 */
public class MakeupCalculator {

	public static void main(String[] args) {
		/**
		 * User guide will provide information of the numeric code for different material type 
		 * instead of letting user to enter the name of materials to increase the difficulties of classification
		 */
		System.out.println("User Guide for enter product material:\n");
		System.out.println("\tNumeric codes for materials:");
		System.out.println("\t\t 0 : Pharmaceuticals ");
		System.out.println("\t\t 1 : Food ");
		System.out.println("\t\t 2 : Electronic");
		System.out.println("\t\t 3 : Others ");
		System.out.print("\n--------------------------------------------------------------\n");

		Scanner reader;
		double basePrice;
		int numPerson;
		int typecode;
		Product product;
		
		while (true) {
			System.out.println("Product #"+Product.getCount());
			//ask user to enter base price of a product
			while (true) {
				System.out.print("\tEnter the base price: $ ");
				reader = new Scanner(System.in); // Reading from System.in
				// System.out.println();
				basePrice = reader.nextDouble();
				//validate the input base price
				if (basePrice < 0) {
					//user enter a negative number.
					System.out.println("!!!Erro: base price cannot be negartive, please try again.");
				} else {
					//only valid data will break the infinite loop
//					System.out.println("you'v enter $"+basePrice);
					break;
				}
			}

			while (true) {
				System.out.print("\tEnter the number of workers: ");
				reader = new Scanner(System.in); // Reading from System.in
				// System.out.println();
				numPerson = reader.nextInt();
				if (numPerson < 0) {
					System.out.println("!!!Erro: number of worker cannot be negartive, please try again.");
				} else {
					// System.out.println("you'v enter labor# "+basePrice);
					break;
				}
			}

			while (true) {
				System.out.print("\tEnter the numeric code for the product material: ");
				reader = new Scanner(System.in); // Reading from System.in
				typecode = reader.nextInt();
				if (typecode > Product.Material.values().length - 1 || typecode < 0) {
					System.out.println("!!!Erro: the code is out of range, please try again.");
				} else {
					//only valid data will break the infinite loop
//					 System.out.println("you'v enter material:
//					 "+Product.Material.values()[typecode]);
					break;
				}
			}
			//all data are validated
			
			product = new Product(basePrice, numPerson, Product.Material.values()[typecode]);
			System.out.println("  Input: " + product.toString());
			System.out.println(String.format("  Output: $%,.2f\n", product.getTotalCost()));
		}

	}
}
