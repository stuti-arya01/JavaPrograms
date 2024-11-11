package Arrays;

//Compare two string arrays are equal

import java.util.Arrays;
public class Assignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] s1 = new String[4];
      String[] s2 = new String[4];
      
      s1[0] = "this"; 
      s1[1] = "is";
      s1[2]="an";
      s1[3]="exception";
      
      s2[0] = "this"; 
      s2[1] = "is";
      s2[2]="zz";
      s2[3]="exception";

   System.out.println("Array s1 " +Arrays.toString(s1));
      System.out.println("Array s2 " +Arrays.toString(s2));

      boolean b1 = Arrays.equals(s1, s2);
      if (b1==true)
      {
          System.out.println("Arrays of String data type are equal");

      }
      
      else
      {
          System.out.println("Arrays of String data type are not equal");

      }

	
	}
	
	

}
