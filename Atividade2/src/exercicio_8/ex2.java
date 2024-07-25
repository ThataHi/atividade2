package exercicio_8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex2 {

	public static void main(String[] args) {
        String sourceFile = "caminho/do/arquivo_fonte.txt";
        String destFile = "caminho/do/arquivo_destino.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
