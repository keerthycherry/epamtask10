package epam10.task;

import java.util.Arrays;
import java.util.List;

public class Average{
	public static void main(String args[]) {
		List<Integer> ll=Arrays.asList(1,2,0,2,1);
		double avg=ll.stream().
		mapToInt(i->i).
		average().orElse(-1);
		System.out.println("Average of list of integers is: "+avg);
		
   }

}