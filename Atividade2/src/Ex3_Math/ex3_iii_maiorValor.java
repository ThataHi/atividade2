package Ex3_Math;

public class ex3_iii_maiorValor {
	public static int encontraMaiorValor(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }

        int maiorValor = array[0]; // Assume que o primeiro elemento é o maior

        // Percorre o array para encontrar o maior valor
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
            }
        }

        return maiorValor;
    }
}
