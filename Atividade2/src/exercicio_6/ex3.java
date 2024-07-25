package exercicio_6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço:");
        String[] inputNumbers = scanner.nextLine().split(" ");

        for (String numStr : inputNumbers) {
            numbers.add(Integer.parseInt(numStr));
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Menor valor: " + min);
        System.out.println("Maior valor: " + max);
    }

}
