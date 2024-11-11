package Arrays;
//Assignment 34 Find out if given two string are anagram of each other
import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "arm";
      String s2 = "ram";
      
      char [] c1 = s1.toCharArray();
      char [] c2 = s2.toCharArray();
      
      Arrays.sort(c1);
      Arrays.sort(c2);
       boolean b1 = Arrays.equals(c1, c2);
       
       if (b1==true)
       {
    	   System.out.println("Strings are anagram");
       }
       
       else 
       {
    	   System.out.println("Strings are not anagram");
       }
      
	}

}
