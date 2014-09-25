import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double base, altura, area;

		System.out.println("Digite a base");
		base = scan.nextDouble();
		System.out.println("Digite a altura");
		altura = scan.nextDouble();

		area = (base * altura) / 2;
		System.out.println("Area total = " + area);

	}
}
