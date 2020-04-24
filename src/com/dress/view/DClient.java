package com.dress.view;

import com.dress.model.basicdress.*;
import com.dress.model.dressdecorator.*;
import com.dress.model.visitor.*;

public class DClient {
	
	public static void main(String[] args) {
		DressVisitor visitor = new DressVisitor();
		
		Dress casualDress = new CasualDress(new BasicDress());
		casualDress.assemble();
		casualDress.accept(visitor);
		System.out.println("There are now " + visitor.getTotalQuality() + " dresses in the order");
		System.out.println();
		
		Dress fancyDress = new FancyDress(new BasicDress());
		fancyDress.assemble();
		fancyDress.accept(visitor);
		System.out.println("There are now " + visitor.getTotalQuality() + " dresses in the order");
		System.out.println();
		
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
		casualSportyDress.assemble();
		System.out.println();
		
	}

}
