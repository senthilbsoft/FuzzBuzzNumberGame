package org.game.fizzbuzz;

public class StageFactory {

	public static FizzBuzz getStage(int stage) {
		return stage == 1 ?  new FizzBuzzStage1() : new FizzBuzzStage2();
	}
}
