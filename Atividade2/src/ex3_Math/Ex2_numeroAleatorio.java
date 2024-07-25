package Ex3_Math;
import java.util.Random;

public class ex3_ii_numeroAleatorio {
	 public static int generateRandomNumber() {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
	        return randomNumber;
	    }
}
