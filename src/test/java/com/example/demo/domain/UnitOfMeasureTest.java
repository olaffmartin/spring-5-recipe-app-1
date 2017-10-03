package com.example.demo.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UnitOfMeasureTest {

	UnitOfMeasure unitOfMeasure;
	
	@Before
	public void setUp() {
		unitOfMeasure = new UnitOfMeasure();
	}
	
	@Test
	public void testGetId() {
		Long idValue = 4L;

		unitOfMeasure.setId(idValue);

		assertEquals(idValue, unitOfMeasure.getId());
	}

	@Test
	public void testGetDescription() {
		String descValue = "Description Test";
		
		unitOfMeasure.setDescription(descValue);
		
		assertEquals(descValue, unitOfMeasure.getDescription());
	}

}
