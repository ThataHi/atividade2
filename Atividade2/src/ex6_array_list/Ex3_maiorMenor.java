package ex6_array_list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3_maiorMenor {
	
	public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço:");
        String[] inputNumbers = scanner.nextLine().split(" ");

        for (String numStr : inputNumbers) {
            numeros.add(Integer.parseInt(numStr));
        }

        int min = Collections.min(numeros);
        int max = Collections.max(numeros);

        System.out.println("Menor valor: " + min);
        System.out.println("Maior valor: " + max);
    }

}
