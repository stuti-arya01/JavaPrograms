package Arrays;
import java.util.Arrays;
//Compare two arrays of char data type

public class Assignment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char c1[] = new char[4];
       char c2[] = new char[4];
       c1[0] = 'T';
       c1[1] = 'H';
       c1[2] = 'I';
       c1[3]  ='S';
       
       c2[0]='T';
       c2[1] ='H';
       c2[2]='I';
       c2[3]='Q';
       
       System.out.println("Array c1 " +Arrays.toString(c1));
       System.out.println("Array c2 " +Arrays.toString(c2));
       
       boolean b1= Arrays.equals(c1, c2);
       if (b1==true)
       {
           System.out.println("Char arrays are equal");

       }
       
       else 
       {
    	   System.out.println("Char arrays are not equal");
       }


	}

}
