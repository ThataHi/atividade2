package Ex3_Math;
import java.util.Scanner;

public class ex3_iii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        // Solicita que o usuário insira os valores do array
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close(); // Fecha o Scanner após a leitura

        int maiorValor = ex3_iii_maiorValor.encontraMaiorValor(array);

        System.out.println("O maior valor no array é: " + maiorValor);
    }
}
