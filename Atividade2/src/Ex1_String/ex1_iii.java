package Ex1_String;
import java.util.Scanner;

public class ex1_iii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine(); 
        
        System.out.print("Digite o caractere a ser encontrado: ");
        char target = scanner.next().charAt(0); // Lendo o caractere alvo
        
        scanner.close(); 
        
        int index = ex1_iii_caractere.primeiroCaractere(str, target);
        
        if (index != -1) {
            System.out.println("Primeira ocorrência do caractere '" + target + "' encontrada no índice: " + index);
        } else {
            System.out.println("O caractere '" + target + "' não foi encontrado na string.");
        }
    }
}
