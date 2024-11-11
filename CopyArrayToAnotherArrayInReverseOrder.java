package Arrays;
//Assignment 78 WAP - Copy value of one array into second array in reverse order
import java.util.Arrays;

public class CopyArrayToAnotherArrayInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int student_id1[] = new int[4];
		int student_id2[] = new int[4];
		
		student_id1[0] = 11;
		student_id1[1] = 12 ;
		student_id1[2]  = 21;
		student_id1[3]  = 20;
		
		for (int i=0, k=3; i<4; i++,k--)
		{
			student_id2[k] = student_id1[i];
		}
		
		System.out.println(Arrays.toString(student_id1));
		System.out.println(Arrays.toString(student_id2));
	}

}
