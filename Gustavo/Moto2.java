
public class Moto {
	
	char cor = 'P';
	int cc;
	double preco;
	String modelo;
	// construtor padrão default
	public Moto(){
		
	}
	
	//construtor com passagem de parametros
	public Moto(String modelo, double preco, int cc, char cor){
		this.modelo = modelo;
		this.preco = preco;
		this.cc = cc;
		this.cor = cor;
	}
	
// metodo imprime os valores da moto, no console.
	void imprimeMoto(){ 
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Preço: " + preco);
		System.out.println("Cilindradas :" + cc);
	}
	
	public static void main(String [] args){
		Moto minha = new Moto();  
		minha.cc = 250;
		minha.imprimeMoto();
		
		Moto my = new Moto("Yamaha", 10000.50, 880, 'M');
		my.imprimeMoto();
		
	}
	

}
