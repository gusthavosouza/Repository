import java.util.Scanner;

public class ThreadExample {

	// processo principal do nosso programa
	// nada mais que a thread main
	public static void main(String[] args) {

		int a, b;
		//cria uma instancia da classe scan com entrada de dados do teclado
		// para fazer a leitura de dados que o usuario digitar no teclado.
		Scanner scan = new Scanner(System.in);
		
		// cria uma instancia da classe de calcular 
		// ate esse momento a mesma ainda nao esta executando
		ThreadCalculate calc = new ThreadCalculate();

		// cria uma thread com parametro a classe de ThreadCalculate que implementa a interface Runnable
		Thread t = new Thread(calc);

		// inicia a thread
		// ao chamar o metodo start e executado o metodo run da classe ThreadCalculate
		t.start();

			// exibi a menssagem digite um numero
			System.out.println("Digite um numero");
			// faz a leitura do numeo digitado pelo usuario e guarda o valor na variavel a
			a = scan.nextInt();
			// exibi a menssagem digite um numero
			System.out.println("Digite um numero");
			// faz a leitura do numeo digitado pelo usuario e guarda o valor na variavel b
			b = scan.nextInt();
			
			// seta os valores para a thread que estava aguardando os dados iniciar o calculo
			calc.setValues(a, b);
			
	}
}
