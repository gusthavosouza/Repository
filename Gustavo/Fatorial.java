import java.util.Scanner;

public class Fatorial {

	static int num1, num2, resultado = 0;

	static int calculaFatorial(int num1) {
		if (num1 == 0) {
			return 1;
		}
		return num1 *= calculaFatorial(num1 - 1); 
	}

	static void lerNumeros() {

		Scanner teclado = new Scanner(System.in);

		System.out
				.println("Digite o primeiro Nº Inteiro para calcular o fatorial!");

		num1 = teclado.nextInt();

		System.out
				.println("Digite o Segundo Nº Inteiro para calcular o fatorial!");

		num2 = teclado.nextInt();
	}

	public static void main(String[] args) {

		lerNumeros();

		resultado = calculaFatorial(num1);
		resultado += calculaFatorial(num2);

		System.out.println("O resultado de " + num1 + "! +" + num2 + "! = "
				+ "" + resultado);
	}
}
