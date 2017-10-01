package com.example.demo.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Recipe;
import com.example.demo.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
		return recipes;
	}

}
