package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Palindromes {
	public static void main(String[] args) {
        List<String> a = Arrays.asList("abba","aba","abba","pqrs","abcddcba","azdx","abcfed");
        List<String> palindromes = Palindromes.findPal(a, (str) -> Palindromes.isPal((String) str));
 
        System.out.println("Palindromes are " + palindromes);
    }
 
    public static boolean isPal(String str) {
    	String newStr ="";
    	for(int i = str.length()-1; i >= 0 ; i--) {
    	newStr = newStr + str.charAt(i);
    	}
    	newStr="";
    	if(str.equalsIgnoreCase(newStr)) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedpal = new ArrayList<String>(); 
    	list.stream().filter((i) -> (predicate.test((String) i))).forEach((i) -> {sortedpal.add((String) i);
        });
        return sortedpal;
 
    }
    

}