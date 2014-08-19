import jeliot.io.*;

public class MyClass {
    public static void main() {
        // Your algorithm goes here.
		double nota1;
		double nota2;
		double media;
		
		
		do{
			Output.println("Digite a sua nota na primeira prova. O valor deve estar entre 0 e 10.");
			nota1= Input.readDouble();
			
		}while(nota1<0 || nota1>10);

		do{
			Output.println("Digite a sua nota na segunda prova. O valor deve estar entre 0 e 10.");
			nota2 = Input.readDouble();
		}while(nota2<0 || nota2>10);
		
		media = (nota1 + nota2)/2;
		
		if(media>=6){
			Output.println("Parabens voce foi aprovado");
		}else{
			Output.println("estude mais inutil");
		}
    }
}
