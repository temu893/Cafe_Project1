package com.perscholas.cafeProject2;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);
		Coffee coffee = new Coffee();

		Cappuccino cappuccino = new Cappuccino();
		Espresso espresso = new Espresso();
		for (int i = 1; i < 4; i++) {
			System.out.println(" What would you like to get today ? ");

			System.out.println("Please select from the following menu:\n" +
					"1: Coffee\n" +
					"2: Cappuccino\n" +
					"3: Espresso");

			 i = s.nextInt();
			if (i == 1) {
				System.out.println("How much Coffee do you want ?" + "\n" );

				int coffeeQuantity = s.nextInt();

				coffee.setQuantity(coffeeQuantity);

				coffee.calculateProductTotal();
				System.out.printf("%-5s %-12s %-5s %-12s %-5s %-12s %-5s %-12s ","Item:",coffee.getName(),"Price:",coffee.getPrice(),"Qty:",coffee.getQuantity() ,"Subtotal:",coffee.coffeeSubtotal + "\n");
				double coffee_Subtotal,coffeeSales_Tax,coffeePurchase_Total ;

				coffee_Subtotal = coffee.getCoffeeSubtotal();
				coffeeSales_Tax = coffee_Subtotal * 0.05 ;
				coffeePurchase_Total = coffee_Subtotal + coffeeSales_Tax;
				System.out.println("\n"
						+"Purchase Subtotal: " + coffee_Subtotal + "\n"
						+ "		Sales Tax: "  + coffeeSales_Tax + "\n"
						+ "		Purchase Total: " + coffeePurchase_Total + "\n");
			}
			else if (i == 2) {
				System.out.println("How much Espresso do you want ?");

				int espressoQuantity = s.nextInt();
				espresso.setQuantity(espressoQuantity);
				espresso.calculateProductTotal();
				System.out.printf("%-5s %-12s %-5s %-12s %-5s %-12s %-5s %-12s ","Item:",espresso.getName(),"Price:",espresso.getPrice(),"Qty:",espresso.getQuantity() ,"Subtotal:",espresso.espressoSubtotal + "\n");
				double espresso_Subtotal,espressoSales_Tax,espressoPurchase_Total ;

				espresso_Subtotal = espresso.espressoSubtotal;
				espressoSales_Tax = espresso_Subtotal * 0.05 ;
				espressoPurchase_Total = espresso_Subtotal + espressoSales_Tax;
				System.out.println("\n"
						+"Purchase Subtotal: " + espresso_Subtotal + "\n"
						+ "		Sales Tax: "  + espressoSales_Tax + "\n"
						+ "		Purchase Total: " + espressoPurchase_Total + "\n");
			}
			else if (i == 3) {
				System.out.println("How much Cappuccino do you want ?");

				int cappuccinoQuantity = s.nextInt();
				cappuccino.setQuantity(cappuccinoQuantity);

				System.out.printf("%-5s %-12s %-5s %-12s %-5s %-12s %-5s %-12s ","Item:",cappuccino.getName(),"Price:",cappuccino.getPrice(),"Qty:",cappuccino.getQuantity() ,"Subtotal:",cappuccino.calculateProductTotal() + "\n");
				double cappuccino_Subtotal,cappuccinoSales_Tax,cappuccinoPurchase_Total ;

				cappuccino_Subtotal = cappuccino.calculateProductTotal();
				cappuccinoSales_Tax = cappuccino_Subtotal * 0.05 ;
				cappuccinoPurchase_Total = cappuccino_Subtotal + cappuccinoSales_Tax;
				System.out.println("\n"
						+"Purchase Subtotal: " + cappuccino_Subtotal + "\n"
						+ "		Sales Tax: "  + cappuccinoSales_Tax + "\n"
						+ "		Purchase Total: " + cappuccinoPurchase_Total + "\n");
			}

		}

	}



}
