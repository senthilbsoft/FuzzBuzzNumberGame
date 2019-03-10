package org.game.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.game.fizzbuzz.FizzBuzz;
import org.game.fizzbuzz.FizzBuzzStage1;
import org.game.fizzbuzz.FizzBuzzStage2;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testNumbersAreFizz_Stage1() {
		int[] fizzNumbers = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84,
				87, 93, 96, 99 };
		for (int num : fizzNumbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertEquals(FizzBuzz.FIZZ, actualRes);
		}
	}

	@Test
	public void testNumbersAreNotFizz_Stage1() {
		int[] notFizzNumbers = { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100 };
		for (int num : notFizzNumbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertNotEquals(FizzBuzz.FIZZ, actualRes);
		}
	}

	@Test
	public void testNumbersAreBuzz_Stage1() {
		int[] buzzNumbers = { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100 };
		for (int num : buzzNumbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertEquals(FizzBuzz.BUZZ, actualRes);
		}
	}

	@Test
	public void testNumbersAreNotBuzz_Stage1() {
		int[] notBuzzNumbers = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81,
				84, 87, 93, 96, 99 };
		for (int num : notBuzzNumbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertNotEquals(FizzBuzz.BUZZ, actualRes);
		}
	}

	@Test
	public void testNumbersFizzBuzz_Stage1() {
		int[] fizzBuzzNumbers = { 15, 30, 45, 60, 75, 90 };
		for (int num : fizzBuzzNumbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertEquals(FizzBuzz.FIZZBUZZ, actualRes);
		}
	}

	@Test
	public void testNumbersNotFizzBuzz_Stage1() {
		int[] notfizzBuzzNumbers = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78,
				81, 84, 87, 93, 96, 99 };
		for (int num : notfizzBuzzNumbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertNotEquals(FizzBuzz.FIZZBUZZ, actualRes);
		}
	}

	@Test
	public void testNumbers_Stage1() {
		int[] numbers = { 1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29, 31, 32, 34, 37, 38, 41, 43, 44, 46,
				47, 49, 52, 53, 56, 58, 59, 61, 62, 64, 67, 68, 71, 73, 74, 76, 77, 79, 82, 83, 86, 88, 89, 91, 92, 94,
				97, 98 };
		for (int num : numbers) {
			FizzBuzz stage1 = new FizzBuzzStage1();
			String actualRes = stage1.getResult(num);
			assertEquals(num, Integer.parseInt(actualRes));
		}
	}

	@Test
	public void testNumbersAreFizz_Stage2() {
		int[] fizzNumbers = { 3, 6, 9, 12, 13, 18, 21, 23, 24, 27, 31, 32, 33, 34, 36, 37, 38, 39, 42, 43, 48, 63, 66,
				69, 72, 73, 78, 81, 83, 84, 87, 93, 96, 99 };
		for (int num : fizzNumbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertEquals(FizzBuzz.FIZZ, actualRes);
		}
	}

	@Test
	public void testNumbersAreNotFizz_Stage2() {
		int[] notFizzNumbers = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 65, 70,
				75, 80, 85, 90, 95, 100 };
		for (int num : notFizzNumbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertNotEquals(FizzBuzz.FIZZ, actualRes);
		}
	}

	@Test
	public void testNumbersAreBuzz_Stage2() {
		int[] buzzNumbers = { 5, 10, 20, 25, 40, 50, 52, 55, 56, 58, 59, 65, 70, 80, 85, 95, 100 };
		for (int num : buzzNumbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertEquals(FizzBuzz.BUZZ, actualRes);
		}
	}

	@Test
	public void testNumbersAreNotBuzz_Stage2() {
		int[] notBuzzNumbers = { 3, 6, 9, 12, 13, 15, 18, 21, 23, 24, 27, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42,
				43, 45, 48, 51, 53, 54, 57, 60, 63, 66, 69, 72, 73, 75, 78, 81, 83, 84, 87, 90, 93, 96, 99 };
		for (int num : notBuzzNumbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertNotEquals(FizzBuzz.BUZZ, actualRes);
		}
	}

	@Test
	public void testNumbersFizzBuzz_Stage2() {
		int[] fizzBuzzNumbers = { 15, 30, 45, 60, 75, 90 };
		for (int num : fizzBuzzNumbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertEquals(FizzBuzz.FIZZBUZZ, actualRes);
		}
	}

	@Test
	public void testNumbersNotFizzBuzz_Stage2() {
		int[] notfizzBuzzNumbers = { 1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23 };
		for (int num : notfizzBuzzNumbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertNotEquals(FizzBuzz.FIZZBUZZ, actualRes);
		}
	}

	@Test
	public void testNumbers_Stage2() {
		int[] numbers = { 1, 2, 4, 7, 8, 11, 14, 16, 17, 19, 22, 26, 28, 29, 41, 44, 46, 47, 49, 61, 62, 64, 67, 68, 71,
				74, 76, 77, 79, 82, 86, 88, 89, 91, 92, 94, 97, 98 };
		for (int num : numbers) {
			FizzBuzz stage2 = new FizzBuzzStage2();
			String actualRes = stage2.getResult(num);
			assertEquals(num, Integer.parseInt(actualRes));
		}
	}

	@Test
	public void testNumbersDividedByThree() {
		int[] numDividesBy3 = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69,
				72, 75, 78, 81, 84, 87, 90, 93, 96, 99 };
		for (int num : numDividesBy3) {
			boolean res = FizzBuzz.divideByThree(num);
			assertTrue(res);
		}
	}

	@Test
	public void testNumbersNotDivededByThree() {
		int[] numNotDividesBy3 = { 1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 29, 31, 32, 34,
				35, 37, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, 56, 58, 59, 61, 62, 64, 65, 67, 68, 70, 71, 73,
				74, 76, 77, 79, 80, 82, 83, 85, 86, 88, 89, 91, 92, 94, 95, 97, 98, 100 };
		for (int num : numNotDividesBy3) {
			boolean res = FizzBuzz.divideByThree(num);
			assertFalse(res);
		}
	}

	@Test
	public void testNumbersDividedByFive() {
		int[] numDividesBy5 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };
		for (int num : numDividesBy5) {
			boolean res = FizzBuzz.divideByFive(num);
			assertTrue(res);
		}
	}

	@Test
	public void testNumbersNotDivededByFive() {
		int[] numNotDividesBy5 = { 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19, 21, 22, 23, 24, 26, 27, 28,
				29, 31, 32, 33, 34, 36, 37, 38, 39, 41, 42, 43, 44, 46, 47, 48, 49, 51, 52, 53, 54, 56, 57, 58, 59, 61,
				62, 63, 64, 66, 67, 68, 69, 71, 72, 73, 74, 76, 77, 78, 79, 81, 82, 83, 84, 86, 87, 88, 89, 91, 92, 93,
				94, 96, 97, 98, 99 };
		for (int num : numNotDividesBy5) {
			boolean res = FizzBuzz.divideByFive(num);
			assertFalse(res);
		}
	}

}
