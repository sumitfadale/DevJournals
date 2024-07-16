package programming;

import java.util.Comparator;
import java.util.List;

public class FP04Exercize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List <String> courses = List.of("Java", "AWS","Python","Appian","Git","Kafka","Angular","React","SpringMVC","SpringBoot", "Java","Git");
	    
	    System.out.println("Sort distinct courses with ascending order");
	    courses.stream()
	           .distinct()
	           .sorted(Comparator.naturalOrder())
	           .forEach(System.out::println);
	    
	    System.out.println("--------------------------------------------------------------------");
	    System.out.println("Sort distinct courses with decending order where contain Spring word");     
	    courses.stream()
	           .filter(course -> course.toLowerCase().contains("spring"))
	           .map(course -> course.concat(" " +"framework"))
	           .sorted(Comparator.reverseOrder())
	           .forEach(System.out::println);
	}

}
//output of above code

//Sort distinct courses with ascending order
//AWS
//Angular
//Appian
//Git
//Java
//Kafka
//Python
//React
//SpringBoot
//SpringMVC
//--------------------------------------------------------------------
//Sort distinct courses with decending order where contain Spring word
//SpringMVC framework
//SpringBoot framework