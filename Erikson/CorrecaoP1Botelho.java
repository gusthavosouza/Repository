public class Teste {
	public static void main(String args[]){
		Televisor samsung=new Televisor(true,0,0);
		samsung.imprimir();
		System.out.println("O televisor ficou "+samsung.ligarDesligar());
	}
}

public class Televisor {
	boolean estado;
	int canal,volume;
	Televisor(boolean estado, int canal, int volume){
		this.estado=estado;
		this.canal=canal;
		this.volume=volume;
	}
}

	public void imprimir(){
		String estado;
		if (this.estado)
			estado = "Ligado";
		else
			estado= "Desligado";
		System.out.println(estado+" CANAL"+this.canal+" VOLUME "+this.volume);
	}

	public String ligarDesligar(){
		if (this.estado)
			this.estado=false;
		return "Desligado";
		else {
			this.estado=true;
			return "Ligado";
		}
	}
}
