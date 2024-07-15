package programming;

import java.util.List;

public class FP01Structural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printListofNumberinLoopStructural(List.of(12, 11, 34, 54, 23, 53));
	}

	private static void printListofNumberinLoopStructural(List<Integer> numbers) {
		// traditional way to print a numbers.
		System.out.println("traditional way to print a numbers.");
		for (int number : numbers) {			
			System.out.println(number);
		}
	}

}

//--------------------------------------output of above code----------------------------------

//traditional way to print a numbers.
//12
//11
//34
//54
//23
//53
