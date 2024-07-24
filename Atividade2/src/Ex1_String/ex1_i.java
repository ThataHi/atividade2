package Ex1_String;
import java.util.Scanner;

public class ex1_i {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Entrada do usuário
        
        System.out.print("Digite uma string para verificar se é um palíndromo: ");
        String str = scanner.nextLine(); 
        
        scanner.close(); // Fecha o Scanner após a leitura
        
        if (ex1_i_palindromo.ehPolidromo(str)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
