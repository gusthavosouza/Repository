import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		String nome = "";
		int n1, n2, atv, media;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do aluno");
		nome = scan.nextLine();

		System.out.println("Digite a 1º nota");
		n1 = scan.nextInt();
		while (n1 < 0 || n1 > 10) {
			System.out.println("Digite a 1º nota de 0 a 10");
			n1 = scan.nextInt();
		}

		System.out.println("Digite a 2º nota");
		n2 = scan.nextInt();
		while (n2 < 0 || n2 > 7) {
			System.out.println("Digite a 2º nota de 0 a 10");
			n2 = scan.nextInt();
		}

		System.out.println("Digite nota da Atividade");
		atv = scan.nextInt();

		while (atv < 0 || atv > 3) {
			System.out.println("Digite nota da Atividade de 0 a 3");
			atv = scan.nextInt();
		}

		media = (n1 + n2 + atv) / 2;

		if (media >= 6) {
			System.out.println("Aprovado");
			System.out.println("media = " + media);
		} else {
			System.out.println("Reprovado");
		}
	}
}
