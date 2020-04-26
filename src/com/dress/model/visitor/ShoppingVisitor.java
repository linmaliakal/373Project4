package com.dress.model.visitor;
import com.dress.model.basicdress.Dress;

public interface ShoppingVisitor {
	public void visit(Dress dress);
}
