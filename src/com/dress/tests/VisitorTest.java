package com.dress.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dress.model.basicdress.BasicDress;
import com.dress.model.basicdress.Dress;
import com.dress.model.dressdecorator.CasualDress;
import com.dress.model.dressdecorator.FancyDress;
import com.dress.model.visitor.ShoppingVisitorImpl;

public class VisitorTest {
	ShoppingVisitorImpl visitor = new ShoppingVisitorImpl();
	Dress casualDress = new CasualDress(new BasicDress());
	Dress fancyDress = new FancyDress(new BasicDress());
	
	@BeforeEach
	void setUp() throws Exception {
		casualDress.assemble();
		fancyDress.assemble();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNoDiscount() {
	//test to visitor without a discount
	casualDress.setPrice(20);
	casualDress.accept(visitor);
	assertEquals(20, visitor.getFinalPrice());
		
	}
	@Test
	void testDiscount() {
	//test to visitor calculating a discount
	fancyDress.setPrice(55);
	fancyDress.accept(visitor);
	assertEquals(50, visitor.getFinalPrice());
		
	}
	
}
