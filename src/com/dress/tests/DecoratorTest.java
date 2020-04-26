package com.dress.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dress.model.basicdress.*;
import com.dress.model.dressdecorator.*;

public class DecoratorTest {
	
	Dress casualDress = new CasualDress(new BasicDress());
	Dress fancyDress = new FancyDress(new BasicDress());
	Dress sportyDress = new SportyDress(new BasicDress());
	
	@BeforeEach
	void setUp() throws Exception {
		casualDress.assemble();
		fancyDress.assemble();
		sportyDress.assemble();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testOneDressFeature() {
	//test for decorator pattern to see if one feature can be added to a basic dress
	assertEquals("", "");
		
	}
	@Test
	void testMultipleDressFeature() {
	//test for decorator pattern to see if more than one feature can be added to a basic dress
	assertEquals("", "");
		
	}

}
