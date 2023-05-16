package com.jhsung.springbootdemo;

import com.jhsung.springbootdemo.game.GameRunner;
import com.jhsung.springbootdemo.game.MarioGame;
import com.jhsung.springbootdemo.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}