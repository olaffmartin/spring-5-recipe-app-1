package com.example.demo.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class IngredientTest {
	
	Ingredient ingredient;
	
	@Before
	public void setUp() {
		ingredient = new Ingredient();
	}

	@Test
	public void testGetId() {
		Long idValue = 4L;

		ingredient.setId(idValue);

		assertEquals(idValue, ingredient.getId());
	}

	@Test
	public void testGetDescription() {
		String descValue = "Description Test";
		
		ingredient.setDescription(descValue);
		
		assertEquals(descValue, ingredient.getDescription());
	}

	@Test
	public void testGetAmount() {
		BigDecimal amount = new BigDecimal(452455);
		
		ingredient.setAmount(amount);
		assertEquals(amount, ingredient.getAmount());
	}

	@Test
	public void testGetRecipe() {
		Long idValue = 4L;
		Recipe recipeData = mock(Recipe.class);
		ingredient.setRecipe(recipeData);

		when(recipeData.getId()).thenReturn(idValue);

		assertEquals(idValue, ingredient.getRecipe().getId());
		
		verify(recipeData, times(1)).getId();
	}

	@Test
	public void testGetUom() {
		Long idValue = 4L;
		UnitOfMeasure uom = mock(UnitOfMeasure.class);
		ingredient.setUom(uom);
		
		when(uom.getId()).thenReturn(idValue);

		assertEquals(idValue, ingredient.getUom().getId());
		verify(uom, times(1)).getId();
	}

}
