package Arrays;
//Assignment24: WAP on array of double, char and boolean data types. 
import java.util.Arrays;
public class ArrayOnDoubleCharBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double rollno[] = new double[4];
     rollno[0]=1.10;
     rollno[1]=2.10;
     rollno[2]=3.10;
     rollno[3]=4.10;
     
     
     char c[] = new char[4];
     c[0]='T';
     c[1]='A';
     c[2]='Q';
     c[3]='Z';
     
     boolean b[] = new boolean[4];
     b[0] = true;
     b[1] = false;
     b[2] = false;
     b[3] = false;
     
  
    	 System.out.println("Double Array " +Arrays.toString(rollno));
    	 System.out.println("Char Array " +Arrays.toString(c));
    	 System.out.println("Boolean Array "  +Arrays.toString(b));

     
	}

}
