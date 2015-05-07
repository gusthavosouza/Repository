import java.util.Scanner;

public class ThreadExample {

	// processo principal do nosso programa
	// nada mais que a thread main
	public static void main(String[] args) {

		int a, b;
		Scanner scan = new Scanner(System.in);
		// cria uma instancia da classe de calcular
		ThreadCalculate calc = new ThreadCalculate();

		// cria uma thread com parametro a classe de calcular que é uma Runnable
		Thread t = new Thread(calc);

		// inicia a thread
		t.start();

			
			System.out.println("Digite um numero");
			a = scan.nextInt();
	
			System.out.println("Digite um numero");
			b = scan.nextInt();
			
			// seta os valores para a thread que estava aguardando os dados iniciar o calculo 
			// calcular
			calc.setValues(a, b);
			
	}
}
