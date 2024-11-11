package Arrays;

/*
 * Create an array and provide student names in it
 * Create an array to save the roll no of the students 
 * Print the student name with roll no 
 * 
 */
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[]= new String[4];
		name[0]="Pranali";
		name[1]="Diksha";
		name[2]="Vaibhav";
		name[3]="Uthappa";
		
		int rollno[] = new int[4];
		rollno[0]=10;
		rollno[1]=11;
		rollno[2]=19;
		rollno[3]=12;
		
		for (int i=0; i<4; i++)
		{
			System.out.println(name[i]+"'s roll no is "+rollno[i]);
		}

	}

}
