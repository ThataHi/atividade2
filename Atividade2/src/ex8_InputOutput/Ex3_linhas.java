package ex8_InputOutput;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3_linhas {
	
	public static void main(String[] args) {
        String[] linhas = {"Linha 1", "Linha 2", "Linha 3"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt"));

            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
