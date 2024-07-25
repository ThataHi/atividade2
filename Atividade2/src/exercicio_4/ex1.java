package exercicio_4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1 {
	
	public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = new ArrayList<>();

        for (String s : stringList) {
            integerList.add(Integer.parseInt(s));
        }

        System.out.println("Lista de Inteiros: " + integerList);
    }

}
