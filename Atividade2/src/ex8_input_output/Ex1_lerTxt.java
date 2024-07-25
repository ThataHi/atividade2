package ex8_input_output;
import java.io.*;

public class Ex1_letTxt {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("seu_arquivo_txt_aqui.txt"));
            String linha;
            while ((line = reader.readLine()) != null) {
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
