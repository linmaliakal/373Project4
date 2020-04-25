package com.dress.view;

import com.dress.model.basicdress.*;
import com.dress.model.dressdecorator.*;
import com.dress.model.visitor.*;

public class DClient {
	
	public static void main(String[] args) {
		//Declare visitor
		ShoppingVisitorImpl visitor = new ShoppingVisitorImpl();
		
		Dress casualDress = new CasualDress(new BasicDress());
		//assemble the dress with a decorator
		casualDress.assemble();
		System.out.println();
		
		//calculate the price of the dress with a visitor
		casualDress.setPrice(20);
		casualDress.accept(visitor);
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		
		Dress fancyDress = new FancyDress(new BasicDress());
		//assemble the dress with a decorator
		fancyDress.assemble();
		System.out.println();
		
		//calculate the price of the dress with a visitor
		fancyDress.setPrice(600);
		fancyDress.accept(visitor);
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		
		Dress sportyDress = new SportyDress(new BasicDress());
		sportyDress.assemble();
		System.out.println();
		
		Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
		sportyFancyDress.assemble();
		System.out.println();
		
		Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
		casualFancyDress.assemble();
		System.out.println();
		
		Dress casualSportyDress = new CasualDress(new SportyDress(new BasicDress()));
		//assemble the dress
		casualSportyDress.assemble();
		System.out.println();
		//calculate the price of the dress
		casualSportyDress.setPrice(55);
		casualSportyDress.accept(visitor);
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		
		
		
		
	}

}
