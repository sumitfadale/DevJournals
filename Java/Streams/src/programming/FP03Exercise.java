package programming;

import java.util.List;

public class FP03Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       List<Integer> numbers = List.of(1, 4, 33, 23, 67, 2, 14, 27, 56, 32);
       System.out.println("Max number in List");
       int maxNum =numbers.stream()
              .reduce(0, Integer::max);
       System.out.println(maxNum);
       
       System.out.println("Min number in List");
       int minNum =numbers.stream()
               .reduce(0, Integer::min);
        System.out.println(minNum);
        
        System.out.println("sum of odd num");
        int sumofOdd =numbers.stream()
        		             .filter(num -> num% 2!=0)
        		             .reduce(0, Integer::sum);
        System.out.println(sumofOdd);
        
       
	}

}

//--------------------------------------output of above code----------------------------------
//Max number in List
//67
//Min number in List
//0
//sum of odd num
//151
