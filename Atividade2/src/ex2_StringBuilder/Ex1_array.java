package ex2_StringBuilder;

public class Ex1_array {
	
	 public static void main(String[] args) {
	        // Array de palavras
	        String[] words = {"Olá", "meu", "nome", "é", "Sara", "Espanhol"};

	        // Construir a string a partir do array de palavras
	        StringBuilder sb = new StringBuilder();
	        for (String word : words) {
	            sb.append(word).append(" ");
	        }

	        // Remover o último espaço extra
	        sb.setLength(sb.length() - 1);

	        // Exibir a string construída
	        System.out.println("String construída: " + sb.toString());

	        
	    }

}
