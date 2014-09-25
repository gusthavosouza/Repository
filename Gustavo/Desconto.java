import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {

		double salario = 0.0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o salario");
		salario = scan.nextDouble();

		if (salario <= 600) {
			System.out.println("Isento");
		} else if (salario > 600 && salario <= 1200) {
			System.out.println("Aplicando desconto de 20% encima do salario = "
					+ salario);
			salario *= 0.8;
			System.out.println("salario = " + salario);
		} else if (salario > 1200 && salario < 2000) {
			System.out.println("Aplicando desconto de 25% encima do salario = "
					+ salario);
			salario *= 0.75;
			System.out.println("salario = " + salario);
		} else {
			System.out.println("Aplicando desconto de 25% encima do salario = "
					+ salario);
			salario *= 0.7;
			System.out.println("salario = " + salario);
		}
	}
}
