package exercicio_8;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex3 {
	
	public static void main(String[] args) {
        String[] lines = {"Linha 1", "Linha 2", "Linha 3", "Linha 4"};
        String filePath = "caminho/do/arquivo.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Array gravado no arquivo com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}
