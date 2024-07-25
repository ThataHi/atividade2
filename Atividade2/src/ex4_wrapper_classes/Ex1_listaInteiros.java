package ex4_wrapper_classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1_listaInteiros {
	
	public static void main(String[] args) {
        List<String> stringList = Arrays.asList("2", "4", "6", "8", "10");
        List<Integer> integerList = new ArrayList<>();

        for (String s : stringList) {
            integerList.add(Integer.parseInt(s));
        }

        System.out.println("Lista de Inteiros: " + integerList);
    }

}
