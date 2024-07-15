package programming;

import java.util.List;

public class FP02Structural {

	public static void main(String[] args) {
		  List <Integer> numbers = List.of(1,4,33,23,67,2,14,27,56,32);
		     List <String> courses = List.of("Java", "AWS","Python","Appian","Git","Kafka","Angular","React","SpringMVC","SpringBoot");

		  System.out.println("Print square of even numbers");
		  numbers.stream()
		         .filter(num -> num %2 ==0)
		         .map(num -> num * num)
		         .forEach(System.out::println);
		  
		  System.out.println("----------------------------------------");
		     System.out.println("Print cube of odd numbers");
		     numbers.stream()
		            .filter(num -> num %2 != 0 )
		            .map(num -> num * num * num)
		            .forEach(System.out::println);
		     
		     System.out.println("----------------------------------------");
		     System.out.println("Print no of character for each courses");
		     courses.stream()
		            .map(course -> course + " "+ course.length())
		            .forEach(System.out::println);
	}

}
