package org.game.fizzbuzz;

import java.util.Scanner;

public class FizzBuzzMain {

	public static final int START = 1;
	public static final int END = 100;

	public static void main(String[] args) {
		printHints();
		System.out.print("\nPlease Enter the Game Stage (1/2) or Any String to Exit : ");
		Scanner readValue = new Scanner(System.in);
		while ((readValue.hasNextInt())) {
			int stage = readValue.nextInt();
			if (stage == 1 || stage == 2) {
				FizzBuzz fizzBuzz = StageFactory.getStage(stage);
				printResult(fizzBuzz);
			}
			System.out.print("\nPlease Enter the Game Stage (1/2) or Any String to Exit : ");
		}
		System.out.println("Program Exited");
		readValue.close();
		System.exit(1);

	}

	private static void printResult(FizzBuzz fizzBuzz) {
		for (int i = START; i <= END; i++) {
			System.out.println(fizzBuzz.getResult(i));
		}
	}
	
	private static void printHints(){
		System.out.println("/******************************************************************************"
				+ "\nStage 1 : \tPrint Fizz if the number is Multiples of 3."
				+ "\n\t\tPrint Buzz if the number is multiples of 5."
				+ "\n\t\tPrint FizzBuzz if above two conditions satisfied together."
				+ "\n"
				+ "\nStage 2 : \tPrint Fizz if the number is divisible by 3 or if it has a 3 in it."
				+ "\n\t\tPrint Buzz if the number is divisible by 5 or if it has a 5 in it."
				+ "\n\t\tPrint FizzBuzz if above two criterias satisfied together."
				+ "\n********************************************************************************");
	}	
}
