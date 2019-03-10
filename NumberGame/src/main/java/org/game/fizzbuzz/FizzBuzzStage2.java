package org.game.fizzbuzz;

public class FizzBuzzStage2 extends FizzBuzz {

	@Override
	public boolean isFizz(int number) {
		return divideByThree(number) || String.valueOf(number).contains(String.valueOf(THREE));
	}

	@Override
	public boolean isBuzz(int number) {
		return divideByFive(number) || String.valueOf(number).contains(String.valueOf(FIVE));
	}

}
