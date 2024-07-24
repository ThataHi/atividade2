package Ex1_String;
import java.util.Scanner;

public class ex1_ii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string para contar as vogais: ");
        String str = scanner.nextLine(); 
        
        scanner.close();
        
        int numVowels = ex1_ii_vogais.contaVogais(str);
        
        System.out.println("Número de vogais na string: " + numVowels);
    }
}
