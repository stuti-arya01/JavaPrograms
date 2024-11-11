package Arrays;

import java.util.Scanner;

/* Assignment 43 Write program Accept the value of your array at the runtime , 
if it is of int datatype size of 4
*/
public class Assignment43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[] = new int[4];
		Scanner s = new Scanner(System.in);
		for (int i=0; i < rollno.length; i++)
		{
			rollno[i] = s.nextInt();
		}
		
		for (int i=0; i<=3; i++)
	     {
	    	 System.out.println("roll no is "+rollno[i]);
	     }
       
		
    }

}
