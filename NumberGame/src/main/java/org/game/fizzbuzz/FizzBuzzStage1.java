package org.game.fizzbuzz;

public class FizzBuzzStage1 extends FizzBuzz {

	@Override
	public boolean isFizz(int number) {
		return divideByThree(number);
	}

	@Override
	public boolean isBuzz(int number) {
		return divideByFive(number);
	}

}
