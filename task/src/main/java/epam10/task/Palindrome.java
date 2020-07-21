package epam10.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome{
	public static void main(String args[]) {
		List<String> l=Arrays.asList("aba","level","mom","epam","abba","xcvfd","rampy","madam","radar");
		Predicate<String> l1=((String str) -> isPalindrome(str));
		List<String> l2=checkPalindromes(l,l1);
		System.out.println(l2);
	}
	public static List<String> checkPalindromes(List<String> l,Predicate<String> p){
		List<String> l1=new ArrayList<>();
		for(String str : l) {
			if(p.test(str)) {
				l1.add(str);
			}
		}
		return l1;
	}
	public static boolean isPalindrome(String str) {
		String str1=str;
		int len=str.length();
		String str2="";
		for(int i=len-1;i>=0;i--) {
			str2=str2+str.charAt(i);
			
		}
		if(str2.equals(str1)) {
			return true;
		}
		else {
			return false;
		}

}

}
