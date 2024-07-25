package Ex1_String;

public class ex1_ii_vogais {
	 public static int contaVogais(String str) {
		 // Converte para minúsculas
	     str = str.toLowerCase();

	      int count = 0;
	      // Percorre a string para contar as vogais
	      for (int i = 0; i < str.length(); i++) {
	      char ch = str.charAt(i);
	      // Verificar se o caractere é uma vogal
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	           count++;
	       }
	    }
	    return count;
	 }
}
