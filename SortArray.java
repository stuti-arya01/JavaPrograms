package Arrays;
//Assignment 45 how to sort the value of your array 
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rollno[] = new int[4];
	     rollno[0] = 10;
	     rollno[1] = 11;
	     rollno[2]= 12;
	     rollno[3]=11;
	     
	     Arrays.sort(rollno);
	     
	     for (int i=0; i<=3; i++)
	     {
	    	 System.out.println(rollno[i]);
	     }
	     
	}

}

