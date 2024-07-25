package ex2_string_builder;

public class Ex3_inserirString {
	
	  public static void main(String[] args) {
	        String inicial = "Olá mundo!";
	        String adicionar = " lindo";
	        int posicao = 4;

	        StringBuilder sb = new StringBuilder(inicial);
	        sb.insert(posicao, adicionar);

	        String resultado = sb.toString();
	        System.out.println(resultado);
	    }
	

}
