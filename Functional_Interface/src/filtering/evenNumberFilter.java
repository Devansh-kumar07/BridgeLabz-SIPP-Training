package filtering;
import java.util.*;
import java.util.stream.*;

/*Scenario 1: Filtering with Functional Interface
Question:
Define a custom functional interface CheckCondition with a method boolean test(int number).
Use a lambda expression to filter only even numbers from a list.
Input:
[3, 8, 12, 5, 7, 10]
Expected Output:
[8, 12, 10]*/

public class evenNumberFilter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,8,12,5,7,10);
		checkCondition isEven = (num) -> num%2==0;
		List<Integer> evens = numbers.stream().filter(isEven::test).collect(Collectors.toList());
		System.out.println(evens);
		
		
	}

}
