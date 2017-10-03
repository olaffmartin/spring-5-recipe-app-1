package com.example.demo.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class RecipeTest {

	Recipe recipe;
	
	@Before
	public void setUp() {
		recipe = new Recipe();
	}
	@Test
	public void testGetId() {
		Long idValue = 4L;

		recipe.setId(idValue);

		assertEquals(idValue, recipe.getId());
	}

	@Test
	public void testGetDescription() {
		String descValue = "Description Test";
		
		recipe.setDescription(descValue);
		
		assertEquals(descValue, recipe.getDescription());
	}

	@Test
	public void testGetPrepTime() {
		Integer prepTime = 55;

		recipe.setPrepTime(prepTime);

		assertEquals(prepTime, recipe.getPrepTime());
	}

	@Test
	public void testGetCookTime() {
		Integer cookTime = 55;

		recipe.setCookTime(cookTime);

		assertEquals(cookTime, recipe.getCookTime());
	}

	@Test
	public void testGetServing() {
		Integer serving = 55;

		recipe.setServing(serving);

		assertEquals(serving, recipe.getServing());
	}

	@Test
	public void testGetSource() {
		String source = "Description Source";
		
		recipe.setSource(source);
				
		assertEquals(source, recipe.getSource());
	}

	@Test
	public void testGetUrl() {
		String url = "spring.test.omn.com";
		
		recipe.setUrl(url);
				
		assertEquals(url, recipe.getUrl());
	}

	@Test
	public void testGetDirections() {
		String directions = "Description Directions";
		
		recipe.setDirections(directions);
		
		assertEquals(directions, recipe.getDirections());
	}

	@Test
	public void testGetImage() {
		int size = 10;
		Byte[] img = new Byte[size];
		recipe.setImage(img);
		assertEquals(size, recipe.getImage().length);
	}

	@Test
	public void testGetNotes() {
		Long idValue = 4L;
		Notes note = mock(Notes.class);
		recipe.setNotes(note);

		when(note.getId()).thenReturn(idValue);

		assertEquals(idValue, recipe.getNotes().getId());
		
		verify(note, times(1)).getId();
	}

	@Test
	public void testGetIngredients() {
		Ingredient	ingredient = mock(Ingredient.class);
		Set<Ingredient> ingredients = new HashSet<>();
		ingredients.add(ingredient);
		recipe.setIngredients(ingredients);
		
		assertEquals(1, recipe.getIngredients().size());
	}

	@Test
	public void testGetDifficulty() {
		String difficulty = "HARD";
		recipe.setDifficulty(Difficulty.HARD);
		assertEquals(difficulty, recipe.getDifficulty().toString());
	}

	@Test
	public void testGetCategories() {
		Category category = new Category();
		Set<Category> categories = new HashSet<>();
		categories.add(category);
		recipe.setCategories(categories);
		
		assertEquals(1, recipe.getCategories().size());
	}

}
