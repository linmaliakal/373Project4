package com.dress.model.visitor;

import com.dress.model.basicdress.BasicDress;
import com.dress.model.basicdress.Dress;
import com.dress.model.dressdecorator.DressDecorator;

public class ShoppingVisitorImpl implements ShoppingVisitor{
	private double finalPrice;
	
	@Override
	public void visit(Dress dress) {
		//apply 5$ discount if book price is greater than 50
		if (dress.getPrice() > 50){
			finalPrice = dress.getPrice()-5;
		}else finalPrice = dress.getPrice();
	}
	public double getFinalPrice() {
		return finalPrice;
	}

}
