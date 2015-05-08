public class ThreadCalculate implements Runnable {

	int a = 0;
	int b = 0;

	boolean run = true;
	
	// após receber os dados notifica a Thread que os dados estão prontos para serem calculados exibidos
	public synchronized void setValues(int a, int b) {

		this.a = a; // guarda o valor recebido do metodo em a
		this.b = b; // guarda o valor recebido do metodo em b
		notify(); // notifica a thread para que a mesma saia do estado wait
	}

	//metodo run que e chamado apos o start da Thread
	@Override
	public void run() {

			System.out.println("[ThreadCalculate] Digite 2 numeros para calcular");
			
			synchronized (this) {
				
				try {
			System.out.println("Entrando em estado de espera dos dados");
			// apos iniciar a Thread coloca a mesma em estado de espera aguardando a entrada de dados.	
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
