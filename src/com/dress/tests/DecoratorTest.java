package com.dress.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dress.model.basicdress.*;
import com.dress.model.dressdecorator.*;

public class DecoratorTest {
	
	Dress fancyDress = new FancyDress(new BasicDress());
	Dress casualSportyDress = new CasualDress(new SportyDress(new BasicDress()));
	
	@BeforeEach
	void setUp() throws Exception {
		fancyDress.assemble();
		casualSportyDress.assemble();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testOneDressFeature() {
	//test for decorator pattern to see if one feature can be added to a basic dress
	assertEquals(fancyDress, fancyDress);
		
	}
	@Test
	void testMultipleDressFeature() {
	//test for decorator pattern to see if more than one feature can be added to a basic dress
	assertEquals(casualSportyDress, casualSportyDress);
		
	}

}
