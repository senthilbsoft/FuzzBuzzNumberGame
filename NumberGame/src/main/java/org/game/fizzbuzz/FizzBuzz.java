package org.game.fizzbuzz;

public abstract class FizzBuzz {

	public static final int THREE = 3;
	public static final int FIVE = 5;

	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	public static final String FIZZBUZZ = "FizzBuzz";

	public abstract boolean isFizz(int number);

	public abstract boolean isBuzz(int number);

	public static boolean divideByThree(int number) {
		return (number % THREE) == 0 ? true : false;
	}

	public static boolean divideByFive(int number) {
		return (number % FIVE) == 0 ? true : false;
	}

	public String getResult(int number) {
		boolean isFizz = isFizz(number);
		boolean isBuzz = isBuzz(number);
		if (isFizz && isBuzz) {
			return FIZZBUZZ;
		} else if (isFizz) {
			return FIZZ;
		} else if (isBuzz) {
			return BUZZ;
		} else {
			return String.valueOf(number);
		}
	}
}
