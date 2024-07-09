package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printListofAllNumberFunctional(List.of(12, 11, 34, 54, 23, 53));
		printListofEvenNumberFunctional(List.of(12, 11, 34, 54, 23, 53));
	}
   
public static void print(int number)
   {
	   System.out.println(number);
   }
	private static void printListofAllNumberFunctional(List<Integer> numbers) {
		//[12, 11, 34, 54, 23, 53] this list of array we need to convert into list.
		//12
		//11
		//34 so on 
		
		//Step 1 : convert numbers of list into stream
		//Step 2 : use a for each loop and do method referance
		System.out.println("Functional way -1");
		numbers.stream().
		       forEach(FP01Functional:: print); // Method referance
		
		System.out.println("Functional way -2");
		numbers.stream().
	       forEach( System.out::println); 
	}
	
	public static boolean isEven(int num)
	{
		return num%2==0;
		
	}
	private static void printListofEvenNumberFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		System.out.println("Print even number using filter 1st way");
		numbers.stream()
		       .filter(FP01Functional:: isEven) // Method referance
		       .forEach(System.out::println);
		
		System.out.println("Print even number using filter and lambda expression 2nd way");
		 numbers.stream()
		        .filter(a -> a%2==0) // Lambda Expression // instead of creating a method just pass parameter of method. a is a parameter of method.
		        .forEach(System.out::println);
	 
	}
}
