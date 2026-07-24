package module2;

import java.util.Arrays;

public class StringFunction7 
{
	public static void main(String[] args) 
	{
		String [] name=new String[3];
		name[0]="Bheem";
		name[1]="Sam";
		name[2]="Rohan";
		System.out.println(Arrays.toString(name));

		int [] rollno=new int[3];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		System.out.println(Arrays.toString(rollno));
	
		char [] initial=new char[3];
		initial[0]='P';
		initial[1]='A';
		initial[2]='H';
		System.out.println(Arrays.toString(initial));
		
	for(int i=0;i<3;i++)
	{
		System.out.println("Name is:"+name[i]+" ,Initial is:"+initial[i]+" & roll no is:"+rollno[i]);
	}	
	}	
	
}
