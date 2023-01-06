package multiThreadedApproach;

public class Program3 extends Thread{
public void run()
{
	try
	{
		System.out.println("Printng started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("Printing Ended");
	}
	catch(Exception e)
	{
		System.out.println("Eception handled");
	}
}
}
