package module2;

import java.util.Arrays;

public class StringFunction6 
{
	public static void main(String[] args) 
	{
		String a="java";
		char [] c1=	a.toCharArray();
		System.out.println(Arrays.toString(c1));

		
		/*Array:
		 * Homogenious value
		 * Fixed size'
		 * You cant increase or decarese the size of the array at run time
		 * Syntax:
		 * datatype [] variable=new datatype[size];
		 * or
		 * datatype variable[]=new datatype[size];
		 */
		
		//		 * datatype [] variable=new datatype[size];

		int [] rollno=new int[5];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		rollno[3]=60;
		rollno[4]=5;
		
		System.out.println(Arrays.toString(rollno));
		/*indexing:Yes
		 * 
		 * 
		 */
				
	
	}	
	
}
