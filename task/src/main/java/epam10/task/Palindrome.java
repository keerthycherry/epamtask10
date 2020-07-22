package epam10.task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

@FunctionalInterface
interface check_palindrome{
    List<String> check_if_palindrome(List<String> list_strings);
}
class PalindromeChecker{

    public static List<String> isPalindrome(List<String> list) {
        return list.stream().filter(t-> t.equals(new StringBuilder(t).reverse().toString())).collect(Collectors.toList());
    }

}
public class Palindrome{
    public Palindrome() {
    }

    public List<String> check_if_palindromes(check_palindrome p, List<String> x) {
        return p.check_if_palindrome(x);
    }
    public static void main(String[] args) {
        Palindrome demo = new Palindrome();
        List<String> l= new ArrayList<>();
        l.add("college");
        l.add("madam");
        l.add("malayalam");
        l.add("india");
        l.add("stats");
        l.add("epam");
        l.add("task");
        List<String> res;

        res = demo.check_if_palindromes(PalindromeChecker::isPalindrome,l);
        System.out.println(res);
    }
}
