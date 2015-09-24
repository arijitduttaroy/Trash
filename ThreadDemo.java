import java.lang.*;


class ThreadDemo extends Thread
{
	public static void main (String [] args)
	{
		Thread t=Thread.currentThread ();
		System.out.println (t);
		t.setName ("ABC");
		System.out.println (t);
		System.out.println ("IS IT ALIVE..?"+t.isAlive ());
		Thread t1=new Thread ();
		System.out.println ("IS IT ALIVE..?"+t.isAlive ());
		System.out.println ("DEFAULT NAME OF THREAD = "+t1.getName ());
		System.out.println ("MAXIMUM PRIORITY VALUE = "+Thread.MAX_PRIORITY);
		System.out.println ("MINIMUM PRIORITY VALUE = "+Thread.MIN_PRIORITY);
		System.out.println ("NORMAL PRIORITY VALUE = "+Thread.NORM_PRIORITY);
	}
}