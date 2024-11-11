package Arrays;
//Assignment 44 Create a array of size of 5 and just check 34 is present in array or not
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VerifyValueIsPresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int student_id[] = new int[5];
		Scanner s1 = new Scanner(System.in); 
		int notocheck=34;
		for (int i=0; i<=4; i++)
		{
			student_id[i]= s1.nextInt();
		}
		
		
		System.out.println(Arrays.toString(student_id));
	
		for (int i=0; i<=4; i++)
		{
			if(notocheck==student_id[i])
			{
				System.out.println("Value is present in array and is at index "+i);
			}
		} 


		
		
	}

}
