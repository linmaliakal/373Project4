package com.dress.model.dressdecorator;

import com.dress.model.basicdress.*;

public class DressDecorator implements Dress{
	//using Decorator pattern with Decorator class that implements Dress Interface
	
	protected Dress dress;
	
	public DressDecorator(Dress c) {
		this.dress = c;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}

}
