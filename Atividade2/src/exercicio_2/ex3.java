package exercicio_2;

public class ex3 {
	
	  public static void main(String[] args) {
	        String original = "Olá mundo!";
	        String toInsert = " lindo";
	        int position = 4;

	        StringBuilder sb = new StringBuilder(original);
	        sb.insert(position, toInsert);

	        String result = sb.toString();
	        System.out.println(result);
	    }
	

}
