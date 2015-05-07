public class ThreadCalculate implements Runnable {

	int a = 0;
	int b = 0;

	boolean run = true;
	
	// após receber os dados notifica a Thread que os dados estão prontos para serem calculados exibidos
	public synchronized void setValues(int a, int b) {

		this.a = a;
		this.b = b;
		notify();
	}

	@Override
	public void run() {

			System.out.println("[ThreadCalculate] Digite 2 numeros para calcular");
			
			// apos iniciar a Thread coloca a mesma em estado de espera aguardando a entrada de dados.
			synchronized (this) {
				
				try {
					wait();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			System.out.println("Numeros digitados:" + a + "," + b);
			System.out.println("Soma dos numeros digitados =" + (a + b));
		System.out.println("Saindo da thread");
	}
	
	public synchronized void destroy () {
		
		this.run = false;
	}
}
