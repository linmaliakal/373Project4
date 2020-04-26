package com.dress.model.dressdecorator;

import com.dress.model.basicdress.*;
import com.dress.model.visitor.*;

public class DressDecorator implements Dress{
	//using Decorator pattern with Decorator class that implements Dress Interface
	
	protected Dress dress;
	private double price;
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	public DressDecorator(Dress c) {
		this.dress = c;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}

	@Override
	public void accept(ShoppingVisitor v) {
		v.visit(this);
		
	}



}
