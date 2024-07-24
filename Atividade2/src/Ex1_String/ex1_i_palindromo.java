package Ex1_String;

public class ex1_i_palindromo {
	public static boolean ehPolidromo(String str) {
        // Remove os espaços em branco e converte para letras minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        // Compara caracteres da esquerda com caracteres da direita
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Se houver diferença, não é palíndromo
            }
            left++;
            right--;
        }
        return true; // É palíndromo
    }
}
