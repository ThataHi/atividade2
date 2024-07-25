package exercicio_4;
import java.util.Scanner;


public class ex3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números separados por vírgulas:");
        String numberString = scanner.nextLine();

        String[] numberArray = numberString.split(",");
        int sum = 0;

        for (String number : numberArray) {
            sum += Integer.parseInt(number.trim());
        }

        System.out.println("Soma total: " + sum);
    }

}
