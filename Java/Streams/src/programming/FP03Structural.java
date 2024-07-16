package programming;

import java.util.List;

public class FP03Structural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 4, 33, 23, 67, 2, 14, 27, 56, 32);
		int sum = addList(numbers);
		System.out.println(sum);

		// ------------------------Another way---------------------
		int sum1 = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(sum1);
		
		// ------------------------Another way---------------------
		int sum2 = numbers.stream()
				  .reduce(0, Integer::sum);
		System.out.println(sum2);
	}

	private static int addList(List<Integer> numbers) {
		return numbers.stream().reduce(0, FP03Structural::sum);

	}

	private static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
//--------------------------------------output of above code----------------------------------

//259
//259
//259
