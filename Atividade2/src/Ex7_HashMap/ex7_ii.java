package Ex7_HashMap;
import java.util.Scanner;

public class ex7_ii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex7_ii_frequenciaPalavras contador = new ex7_ii_frequenciaPalavras();

        System.out.println("Digite o texto para contar a frequência de palavras:");
        String texto = scanner.nextLine();

        // Conta a frequência de palavras no texto
        contador.contarPalavras(texto);

        // Exibe a frequência das palavras
        contador.exibirFrequencia();

        scanner.close();
    }
}
