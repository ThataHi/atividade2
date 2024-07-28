package ex4_WrapperClasses;
import java.util.Arrays;
import java.util.List;

public class Ex2_calculo {
	
	  public static void main(String[] args) {
	        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

	        int soma = 0;
	        for (int number : integerList) {
	            soma += number;
	        }

	        double media = (double) soma / integerList.size();

	        System.out.println("Soma: " + soma);
	        System.out.println("Média: " + media);
	    }

}
