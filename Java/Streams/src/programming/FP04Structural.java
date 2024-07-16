package programming;

import java.util.Comparator;
import java.util.List;

public class FP04Structural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<Integer> numbers = List.of(1, 4, 33, 23, 4, 2, 14, 27, 33, 32);
		   System.out.println("Find distinct number");
		   numbers.stream()
		          .distinct()
		          .forEach(System.out::println);
		   
		   System.out.println("sorted number");
		   numbers.stream()
	          .sorted()
	          .forEach(System.out::println);
		   
		   System.out.println("sorted number with natural (ascending) order");
		   numbers.stream()
	          .sorted(Comparator.naturalOrder())
	          .forEach(System.out::println);
		   
		   System.out.println("sorted number with reverse (decending) order");
		   numbers.stream()
	          .sorted(Comparator.reverseOrder())
	          .forEach(System.out::println);
	}

}
 //------------------output of above code---------------------
//Find distinct number
//1
//4
//33
//23
//2
//14
//27
//32
//sorted number
//1
//2
//4
//4
//14
//23
//27
//32
//33
//33
//sorted number with natural (ascending) order
//1
//2
//4
//4
//14
//23
//27
//32
//33
//33
//sorted number with reverse (decending) order
//33
//33
//32
//27
//23
//14
//4
//4
//2
//1
