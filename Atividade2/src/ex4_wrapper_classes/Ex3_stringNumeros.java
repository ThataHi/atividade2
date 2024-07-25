package ex4_wrapper_classes;
import java.util.Scanner;


public class Ex3_stringNumeros {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números separados por vírgulas:");
        String numberString = scanner.nextLine();

        String[] numberArray = numberString.split(",");
        int soma = 0;

        for (String number : numberArray) {
            soma += Integer.parseInt(number.trim());
        }

        System.out.println("Soma total: " + soma);
    }

}
