package Ex1_String;

public class ex1_iii_caractere {
	public static int primeiroCaractere(String str, char target) {
        // Percorrer a string para encontrar a primeira ocorrência do caractere 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i; // Retorna o índice da primeira ocorrência encontrada
            }
        }
        return -1; // Retorna -1 se o caractere não foi encontrado na string
    }
}
