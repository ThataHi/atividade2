package ex8_input_output;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3_linhas {
	
	public static void main(String[] args) {
        String[] linhas = {"Linha 1", "Linha 2", "Linha 3", "Linha 4"};
        String caminhoArquivo = "caminho_do_arquivo.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }

            System.out.println("Array gravado no arquivo com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}
