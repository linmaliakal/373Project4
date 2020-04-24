package com.dress.model.visitor;

import com.dress.model.basicdress.*;

public class DressVisitor implements Visitor {
	private int totalQuantity;
	@Override
	public void visit(Dress dress) {
		      totalQuantity = dress.getQuantity() + 1;
		      dress.setQuantity(totalQuantity);
	}
	public int getTotalQuality() {
	    return totalQuantity;
	  }

}