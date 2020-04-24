package com.dress.view;

import com.dress.model.basicdress.*;
import com.dress.model.dressdecorator.*;

public class DClient {
	
	public static void main(String[] args) {
		
		Dress casualDress = new CasualDress(new BasicDress());
		casualDress.assemble();
		System.out.println();
		
		Dress fancyDress = new FancyDress(new BasicDress());
		fancyDress.assemble();
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
