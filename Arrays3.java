package Arrays;

import java.util.Arrays;

/*
 * Compare 2 arrays are equals or not 
 */

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int student_id1[] = new int[4];
  student_id1[0] = 10;
  student_id1[1] = 11; 
  student_id1[2] = 12; 
  student_id1[3] = 19; 
  
  
  int student_id2[] = new int[4];
  student_id2[0] = 10;
  student_id2[1] = 11; 
  student_id2[2] = 12; 
  student_id2[3] = 11;
  
  
  boolean b1 = Arrays.equals(student_id1, student_id2);
  System.out.println(b1);
  
	}

}
