package com.example.demo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DifficultyTest {

	@Test
	public void test() {
		String difficulty = "EASY";
		assertEquals(difficulty, Difficulty.EASY.toString());
	}

}
