package com.dress.model.basicdress;

import com.dress.model.visitor.ShoppingVisitor;

public class BasicDress implements Dress {
	private double price;
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public void assemble() {
		System.out.println("Basic Dress Features");	
	}

	@Override
	public void accept(ShoppingVisitor v) {
		v.visit(this);
		
	}
	
}
