class Th1 extends Thread
{
	public void run ()
	{
		try
		{
			for (int i=1; i<=10; i++)
			{
				if (i<6)
				{
				System.out.println ("VALUE OF I = "+i);
				Thread.sleep (500);
				}
				else 
				{
				Thread.sleep (5000);	
				}
			}
		}
		catch (InterruptedException ie)
		{
			System.out.println (ie);
		}
	}
};
		
class ThreadDemo1
{
	public static void main (String [] args)
	{
		Th1 t1=new Th1 ();
		System.out.println ("IS T1 ALIVE BEFORE START = "+t1.isAlive ());
		t1.start ();
		System.out.println ("IS T1 ALIVE AFTER START = "+t1.isAlive ());
	}
}