package com.dress.model.dressdecorator;

import com.dress.model.basicdress.*;

public class DressDecorator implements Dress{
	
	protected Dress dress;
	
	public DressDecorator(Dress c) {
		this.dress = c;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}

}
