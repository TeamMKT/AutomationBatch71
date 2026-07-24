package module2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to accept all the values of array at run time
public class ArrayInput 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of your array");
		int [] rollno=new int[s1.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter the value of array at index:->"+i);
		rollno[i]=s1.nextInt();

		}
		System.out.println("Final output:->"+Arrays.toString(rollno));

		/*2
		 * index:0:21
		 * [21,0]
		 * index:1:56
		 * [21,56]
		 */
		
		
		s1.close();
	}
}
