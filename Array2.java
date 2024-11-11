package Arrays;
/*
 *Try to store more data than its size in an array
 */
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int rollno[] = new int[2];
     rollno[0] = 10;
     rollno[1] = 11;
     rollno[2]= 12;
     rollno[3]=11;
     
     for (int i=0; i<=3; i++)
     {
    	 System.out.println("roll no is "+rollno[i]);
     }
	}

}
