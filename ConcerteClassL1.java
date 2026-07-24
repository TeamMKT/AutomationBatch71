	package module2;
	interface H1
	{
		void y1();//abstarct method
	}
	interface H2
	{
		void y2();//abstarct method
	}
	public class ConcerteClassL1 implements H1,H2
	{
		public static void main(String[] args) 
		{
			
		}
	
		public void y1() 
		{
			System.out.println("Logic will be here 1");
		}
		public void y2() 
		{
			System.out.println("Logic will be here 2");
		}
	}
