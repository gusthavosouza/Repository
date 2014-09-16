package aluno;

public class Aluno {
	String nome = "";
	String cpf = "";
	int codmat;
	char sexo;
	float nota_p1;
	float nota_p2;

	public Aluno(String nome, String cpf, int codmat, char sexo, float nota_p1,
			float nota_p2) {
		this.nome = nome;
		this.cpf = cpf;
		this.codmat = codmat;
		this.sexo = sexo;
		this.nota_p1 = nota_p1;
		this.nota_p2 = nota_p2;

	}

	void imprimeAluno() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Código de Matricula: " + codmat);
		System.out.println("Nota da P1: " + nota_p1);
		System.out.println("Nota da P2: " + nota_p2);
	}
	
	void imprimeSexo()	{
		if (sexo=='M' || sexo=='m' ){
			System.out.println("Sexo: Masculino");
		} else if (sexo=='F' || sexo=='f' ){
			System.out.println("Sexo: Feminino");
		}else{
			System.out.println("Sexo: Desconhecido");
		}
	}
	
	float mediaAluno(float nota_p1, float nota_p2){
		float media;
		media = ((nota_p1+nota_p2)/2); 
		return media;
	}
	
	void resultado(float media){
		if (media>= 7){ 
			System.out.println("Aprovado.");		
		}else if(media <7 && media >= 3 ) {
			System.out.println("Exame.");
		}else{
			System.out.println("Reprovado.");
		}
	}
}
