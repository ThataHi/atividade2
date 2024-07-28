package ex8_InputOutput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_letTxt {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("seu_arquivo_txt_aqui.txt"));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
