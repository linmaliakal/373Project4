package com.dress.model.dressdecorator;

import com.dress.model.basicdress.Dress;

public class FancyDress extends DressDecorator{
	
	public FancyDress(Dress c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Fancy Dress Features");
	}

}
