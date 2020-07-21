package epam10.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pattern{
		public static void main(String args[]) {
			List<String> l=Arrays.asList("amp","ant","bat","cat","dark","aunt","lazy","cozy","epam");
			List<String> ll1=ValidStrings(l,(String str)->(str.charAt(0)=='a' && str.length()==3));
			System.out.println(ll1);
		}
		public  static List<String> ValidStrings(List<String> l, Predicate<String> p) {
			List<String> al=new ArrayList<>();
			for(String str:l) {
				if(p.test(str)) {
					al.add(str);
				}
			}
			return al;
		}


}
