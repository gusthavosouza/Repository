
public class Professor {
	
	int cod_prof;
	String nome;
	String email;
	String  telefone;
	
	Professor(){
	}
	
	Professor(int cod_prof, String nome, String email, String telefone){
		this.cod_prof = cod_prof;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	void imprimeProfessor(){
		System.out.println("Nome: " + nome);
		System.out.println("Codigo: " +cod_prof);
		System.out.println("Email: "+ email);
		System.out.println("Telefone: " + telefone);
	}
	
	public static void main(String args[]){
	
		Professor botelho = new Professor(105, "Carlos Botelho", "botelho@botelho.com.br", "(11) 45254542");
		botelho.imprimeProfessor();
	}
}


/*
 * 
 * 
 * 
 * 2.3. Criar uma classe Java chamada Professor para modelar professores. A classe deve possuir os seguintes atributos de dados
(propriedades):
o cod_professor – Código do Professor - (tipo int)
o nome_prof – Nome do Professor – (tipo String)
o email_prof – Email do Professor – (tipo String)
o fone_prof – Fone do Professor – (tipo String)
A classe deve conter métodos para construir objetos (um construtor com parâmetros e outro sem parâmetros) e um
método Imprime_Professor() que irá imprimir os dados do professor.
 * 
 */
