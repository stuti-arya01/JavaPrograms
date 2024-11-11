package Arrays;

//Print [2,4,6,8,10] array in reverse order in new array
import java.util.Arrays;
public class Assignment27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] a1 = new int[5];
		int[] a2 = new int[5];
		
		a1[0]=2;
		a1[1]=4;
		a1[2]=6;
		a1[3]=8;
		a1[4]=10;
		
		for (int i=0,k=4; i<a1.length; i++,k--)
		{
			a2[k]=a1[i];
		}
		System.out.println("Array a1 " +Arrays.toString(a1));

		System.out.println("Array a2 in reverse order " +Arrays.toString(a2));
		
		
		
	}

}
