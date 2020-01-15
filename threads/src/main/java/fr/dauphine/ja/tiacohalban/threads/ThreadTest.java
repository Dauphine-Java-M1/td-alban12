package fr.dauphine.ja.tiacohalban.threads;

public class ThreadTest {
	private static Integer n=0;
	private static Object monitor = new Object();
	
	public static Runnable createRun(final int id)
	{
		return new Runnable() {
			public void run() {
				for (;n<10000-1;) {
				synchronized(monitor) {
					n++;
					System.out.println("Je suis le thread+"+id+" et j'effectue l'itération"+n);
				}
				}
			}
		};
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(createRun(1));
		Thread t2 = new Thread(createRun(2));
		Runnable runnable = ()->{System.out.println("bonjour");};
		Thread t3 = new Thread( ()-> {
			for (;n<10000-1;) {
				synchronized(monitor) {
					n++;
					System.out.println("Je suis le thread 3 et j'effectue l'itération"+n);
				}
		}
			});
		t1.start();t2.start();t3.start();
	}

}