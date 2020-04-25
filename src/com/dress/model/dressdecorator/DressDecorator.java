package com.dress.model.dressdecorator;

import com.dress.model.basicdress.*;
import com.dress.model.visitor.*;

public class DressDecorator implements Dress{
	//using Decorator pattern with Decorator class that implements Dress Interface
	
	protected Dress dress;
	
	private int price;
	
	public DressDecorator(Dress c) {
		this.dress = c;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
