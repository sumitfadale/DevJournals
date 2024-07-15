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

// --------------------------------------output of above code----------------------------------
//Print square of even numbers
//16
//4
//196
//3136
//1024
//----------------------------------------
//Print cube of odd numbers
//1
//35937
//12167
//300763
//19683
//----------------------------------------
//Print no of character for each courses
//Java 4
//AWS 3
//Python 6
//Appian 6
//Git 3
//Kafka 5
//Angular 7
//React 5
//SpringMVC 9
//SpringBoot 10
