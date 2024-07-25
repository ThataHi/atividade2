package Ex3_Math;
import java.util.Scanner;

public class ex3_i {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Digite o comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        scanner.close(); 

        double hipotenusa = ex3_i_hipotenusa.calculaHipotenusa(cateto1, cateto2);

        System.out.println("A hipotenusa do triângulo retângulo é: " + hipotenusa);
    }
}
