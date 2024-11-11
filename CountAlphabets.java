package Arrays;
/* Assignment 36 In given String find how many are alphabets, 
how many are special character, how many are numeric, how many are Spaces
*/

public class CountAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "@@ customer number 9999";
      int CountOfAlphabet = 0; 
      int CountOfNumeric = 0;
      int CountOfSpace = 0;
      int CountOfSpecialChar = 0;
      int TotalLength = a.length(); 
      char c1[] = a.toCharArray(); 
      
      for (int i=0; i<=a.length()-1; i++)
      {
    	      boolean b1 = Character.isLetter(c1[i]);
    	      System.out.println(b1);
    	      if (b1==true)
    	      {
    	    	  CountOfAlphabet++ ; 
    	    	  
    	      }
      }
      for (int i=0; i<=a.length()-1; i++)
      {
    	      boolean b1 = Character.isDigit(c1[i]);
    	      System.out.println(b1);
    	      if (b1==true)
    	      {
    	    	  CountOfNumeric++ ; 
    	    	  
    	      }
      }
      
      for (int i=0; i<=a.length()-1; i++)
      {
    	  boolean b1 = Character.isWhitespace(c1[i]);
    	  System.out.println(b1);
    	  if (b1==true)
    	  {
    		  CountOfSpace++;
    	  }
      }
      
      
      CountOfSpecialChar = TotalLength - (CountOfAlphabet + CountOfNumeric + CountOfSpace) ; 
      
      System.out.println("Count of Alphabets are "+CountOfAlphabet);
      System.out.println("Count of Numerics are "+CountOfNumeric);
      System.out.println("Coun of Space chars are "+CountOfSpace);
      System.out.println("Coun of Special Chars are "+CountOfSpecialChar);
	}

}
