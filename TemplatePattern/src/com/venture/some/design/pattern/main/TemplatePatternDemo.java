package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Game;
import com.venture.some.design.pattern.impl.BasketBallGame;
import com.venture.some.design.pattern.impl.FootballGame;

public class TemplatePatternDemo {

	public static void main(String[] args) {

		Game game = new FootballGame();
		game.play();
		
		game = new BasketBallGame();
		game.play();
	}
}