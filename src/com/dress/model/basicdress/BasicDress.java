package com.dress.model.basicdress;

import com.dress.model.visitor.*;

public class BasicDress implements Dress {
	private int quantity = 0;
	@Override
	public void assemble() {
		System.out.println("Basic Dress Features");	
	}
	@Override
	public void accept(DressVisitor visitor) {
	    visitor.visit(this);
	  }
	@Override
	public int getQuantity() {
		return quantity;
	}
	@Override
	public void setQuantity(int i) {
		this.quantity = i;
		
	}

}
