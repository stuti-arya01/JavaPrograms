package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Taking values into an array using scanner and print the array 
 */


public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student_id[] = new int[4];
		Scanner s1 = new Scanner(System.in); 
		
		for (int i=0; i<4; i++)
		{
			student_id[i]= s1.nextInt();
		}
		
		
		System.out.println(Arrays.toString(student_id));
	}

}
