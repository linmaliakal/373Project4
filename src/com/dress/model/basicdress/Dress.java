package com.dress.model.basicdress;

import com.dress.model.visitor.*;

public interface Dress {
	
	public void assemble();
	public abstract void accept(DressVisitor v);
	public int getQuantity();
	public void setQuantity(int i);

}
