package programming;

import java.util.List;

public class FP01StructuralExercize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List <Integer> numbers = List.of(1,4,33,23,67,2,14,27,56,32);
     List <String> courses = List.of("Java", "AWS","Python","Appian","Git","Kafka","Angular","React","SpringMVC","SpringBoot");
     System.out.println("Print odd numbers");
     numbers.stream()
            .filter(num -> num % 2 !=0 )
            .forEach(System.out::println);
     System.out.println("----------------------------------------");
     System.out.println("Pring Couresr which contains Spring word");
     courses.stream()
            .filter(course -> course.toLowerCase().contains("spring"))
            .forEach(System.out::println);
     
     System.out.println("----------------------------------------");
     System.out.println("Print coureses length greater than 4");
     
     courses.stream()
            .filter(course -> course.length()>=4)
            .forEach(System.out::println);
	}

}
