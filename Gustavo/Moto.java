public class Moto {

	String marca;
	String modelo;
	String cor;
	int marcha;
	int menorMarcha;
	int maiorMarcha;

	public Moto(String marca, String modelo, String cor, int marcha,
			int menorMarcha, int maiorMarcha) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.menorMarcha = menorMarcha;
		this.maiorMarcha = maiorMarcha;
	}

	public void marchaAcima() {
		if(marcha < maiorMarcha){
			marcha++;
		}
	}

	public void marchaAbaixo() {
		if(marcha > menorMarcha){
			marcha--;
		}
	}

	public void imprimeMoto() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Marcha: " + marcha);
	}
	
	public static void main(String[] args) {
		Moto moto = new Moto("Yamaha", "Ybr", "azul", 1, 0, 5);
		moto.imprimeMoto();
		moto.marchaAcima();
		moto.imprimeMoto();
		moto.marchaAcima();
		moto.marchaAcima();
		moto.marchaAcima();
		moto.imprimeMoto();
		moto.marchaAcima();
		moto.imprimeMoto();
		moto.marchaAbaixo();
	}
}
