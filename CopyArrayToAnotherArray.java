package Arrays;
//Assignment 35 Copy the value of one array to another array using iteration
//Assignment 77 WAP - Copy value of one array into second array
import java.util.Arrays;

public class CopyArrayToAnotherArray {

	public static void main(String[] args)
	{
	int student_id1[] = new int[4];
	int student_id2[] = new int[4];
	
	student_id1[0] = 11;
	student_id1[1] = 12 ;
	student_id1[2]  = 21;
	student_id1[3]  = 20;
	
	for (int i=0; i<4; i++)
	{
		student_id2[i] = student_id1[i];
	}
	
	System.out.println(Arrays.toString(student_id1));
	System.out.println(Arrays.toString(student_id2));
}
}