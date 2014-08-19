import jeliot.io.*;

public class MyClass {
    public static void main() {
        double media, nota1, nota2;
        Output.println("Digite a primeira nota");
		nota1= Input.readDouble();
			while (nota1 <0 || nota1 >10)
		{ Output.println("Nota incorreta, digite um valor entre 0 e 10");
		nota1=Input.readDouble();}
		nota2=Input.readDouble();
     		while 
		(nota2 <0 || nota2 >10)
		{ Output.println("Nota incorreta, digite um valor entre 0 e 10");
		nota2=Input.readDouble();}
		media = ((nota1+nota2)/2);
		if
			(media >= 6)
			Output.println("Aprovado com a media " +media);
		else
			Output.println("Negado com a media " +media);
		

    }
}
