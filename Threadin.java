package abhi;

public class Threadin extends Thread {

	
	
	public void run()
		{
			System.out.println("Thread is running");
		}
	public static void main(String[] args)
	{
	Threadin t= new Threadin();
	t.start();
	}
	}
