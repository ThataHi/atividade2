package exercicio_4;
import java.util.Arrays;
import java.util.List;

public class ex2 {
	
	  public static void main(String[] args) {
	        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

	        int sum = 0;
	        for (int number : integerList) {
	            sum += number;
	        }

	        double average = (double) sum / integerList.size();

	        System.out.println("Soma: " + sum);
	        System.out.println("Média: " + average);
	    }

}
