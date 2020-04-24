package com.dress.model.dressdecorator;

import com.dress.model.basicdress.*;

public class CasualDress extends DressDecorator{
	
	public CasualDress(Dress c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Casual Dress Features");
	}

}
