package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var game = new PacmanGame();
		// Object Creation
		
		var gameRunner = new GameRunner(game);
		// Object Creation + Wiring of Dependencies
		// Game is a Dependency
		
		gameRunner.run();
	}

}
