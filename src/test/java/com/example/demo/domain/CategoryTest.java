package com.example.demo.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	Category category;

	@Before
	public void setUp() {
		category = new Category();
	}

	@Test
	public void testGetId() {
		Long idValue = 4L;

		category.setId(idValue);

		assertEquals(idValue, category.getId());
	}

	@Test
	public void testGetDescription() {
		String descValue = "Description Test";

		category.setDescription(descValue);

		assertEquals(descValue, category.getDescription());
	}

	@Test
	public void testGetRecipes() {

		Recipe recipeData = mock(Recipe.class);
		Set<Recipe> recipes = new HashSet<>();
		recipes.add(recipeData);
		category.setRecipes(recipes);

		assertEquals(1, category.getRecipes().size());
	}

}
