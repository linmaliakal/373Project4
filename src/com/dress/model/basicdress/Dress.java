package com.dress.model.basicdress;
import com.dress.model.visitor.*;
public interface Dress {
	
	public void assemble();
	public void accept(ShoppingVisitor v);
	public double getPrice();
	public void setPrice(double price);
}
