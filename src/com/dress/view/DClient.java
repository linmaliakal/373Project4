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
		//calculate the price of the dress with a visitor
		casualDress.setPrice(20);
		casualDress.accept(visitor);
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		System.out.println();
		
		Dress fancyDress = new FancyDress(new BasicDress());
		//assemble the dress with a decorator
		fancyDress.assemble();
		fancyDress.setPrice(600);
		fancyDress.accept(visitor);
		//calculate the price of the dress with a visitor
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		System.out.println();
		
		Dress sportyDress = new SportyDress(new BasicDress());
		//assemble the dress with a decorator
		sportyDress.assemble();
		sportyDress.setPrice(80);
		sportyDress.accept(visitor);
		//calculate the price of the dress with a visitor
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		System.out.println();
		
		Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
		//assemble the dress with a decorator
		sportyFancyDress.assemble();
		sportyFancyDress.setPrice(200);
		sportyFancyDress.accept(visitor);
		//calculate the price of the dress with a visitor
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		System.out.println();
		
		Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
		//assemble the dress with a decorator
		casualFancyDress.assemble();
		casualFancyDress.setPrice(150);
		casualFancyDress.accept(visitor);
		//calculate the price of the dress with a visitor
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		System.out.println();
		
		Dress casualSportyDress = new CasualDress(new SportyDress(new BasicDress()));
		//assemble the dress with a decorator
		casualSportyDress.assemble();
		casualSportyDress.setPrice(55);
		casualSportyDress.accept(visitor);
		//calculate the price of the dress with a visitor
		System.out.println("The price of this dress is $" + visitor.getFinalPrice());
		
		
		
		
	}

}
