package ex6_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2_numerosOrdenados {
	
	public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço:");
        String[] inputNumbers = scanner.nextLine().split(" ");
        
        for (String numStr : inputNumbers) {
            numeros.add(Integer.parseInt(numStr));
        }

        Collections.sort(numeros);

        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

}
