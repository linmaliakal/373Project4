package com.dress.model.dressdecorator;

import com.dress.model.basicdress.*;
import com.dress.model.visitor.DressVisitor;

public class DressDecorator implements Dress{
	//using Decorator pattern with Decorator class that implements Dress Interface
	
	protected Dress dress;
	private int quantity = 0;
	public DressDecorator(Dress c) {
		this.dress = c;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}

	@Override
	public void accept(DressVisitor visitor) {
	    visitor.visit(this);
	  }

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	@Override
	public void setQuantity(int i) {
		this.quantity = i;
	}

}
