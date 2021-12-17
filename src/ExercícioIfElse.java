import java.util.Locale;
import java.util.Scanner;

public class ExercícioIfElse {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Scanner usar o teclado
        
        double nota1 = sc.nextDouble();  // mext serve para digitar na tela e ler o numero digitato
        double nota2 = sc.nextDouble();
        
        double notaFinal = nota1 + nota2; //texto explicativo //imprimido as duas nota final 
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal); //somando o texto explicativo mais anota final 
        
        if (notaFinal <60.0) { //se for menor que 60 a nota,inprimir as memsagem reprovado ou aprovado
      	  System.out.println("REPROVADO");
        }else {
      	  System.out.println("APROVADO");
        }
	}

}
