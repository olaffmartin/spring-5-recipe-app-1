package com.example.demo.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class NotesTest {

	Notes note;
	
	@Before
	public void setUp() {
		note = new Notes();
	}
	
	@Test
	public void testGetId() {
		Long idValue = 4L;

		note.setId(idValue);

		assertEquals(idValue, note.getId());
	}

	@Test
	public void testGetRecipe() {
		Long idValue = 4L;
		Recipe recipeData = mock(Recipe.class);
		note.setRecipe(recipeData);

		when(recipeData.getId()).thenReturn(idValue);

		assertEquals(idValue, note.getRecipe().getId());
		
		verify(recipeData, times(1)).getId();
	}

	@Test
	public void testGetRecipeNotes() {
		String recipeNotesValue = "Description Test";

		note.setRecipeNotes(recipeNotesValue);

		assertEquals(recipeNotesValue, note.getRecipeNotes());
	}

}
