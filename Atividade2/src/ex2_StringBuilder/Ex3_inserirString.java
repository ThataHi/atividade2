package ex2_StringBuilder;

public class Ex3_inserirString {
	
	  public static void main(String[] args) {
	        String inicial = "Inicio Fim";
	        String adicionar = " Meio";
	        int posicao = 6;

	        StringBuilder sb = new StringBuilder(inicial);
	        sb.insert(posicao, adicionar);

	        String resultado = sb.toString();
	        System.out.println(resultado);
	    }
	

}
