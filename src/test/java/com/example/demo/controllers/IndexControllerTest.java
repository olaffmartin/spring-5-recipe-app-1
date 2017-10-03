package com.example.demo.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.example.demo.domain.Recipe;
import com.example.demo.services.RecipeService;

public class IndexControllerTest {
	
	IndexController indexController;
	
	@Mock
	RecipeService recipeService;
	
	@Mock
	Model model;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		indexController = new IndexController(recipeService);
	}

	@Test
	public void testGetIndexPage() {
				
		// Given
		Set<Recipe> recipes = new HashSet<>();
		recipes.add(new Recipe());
		recipes.add(new Recipe());
		
		when(recipeService.getRecipes()).thenReturn(recipes);
		
		@SuppressWarnings("unchecked")
		ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
		
		// When
		String view = "index";
		
		// Then
		assertEquals(view, indexController.getIndexPage(model));
		verify(recipeService, times(1)).getRecipes();
		// anySet(), recipeService.getRecipes(),  argumentCaptor.capture()
		verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
		
		Set<Recipe> setIndex = argumentCaptor.getValue();
		assertEquals(2, setIndex.size());
	}

}
