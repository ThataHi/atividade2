package exercicio_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço:");
        String[] inputNumbers = scanner.nextLine().split(" ");
        
        for (String numStr : inputNumbers) {
            numbers.add(Integer.parseInt(numStr));
        }

        Collections.sort(numbers);

        System.out.println("Números ordenados:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
