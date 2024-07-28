package ex8_InputOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_arquivo {

	public static void main(String[] args) {
        String arquivoBase = "caminho_do_arquivo_base.txt";
        String arquivoFinal = "caminho_do_arquivo_final.txt";

        try (FileInputStream fis = new FileInputStream(arquivoBase);
             FileOutputStream fos = new FileOutputStream(arquivoFinal)) {

            byte[] buffer = new byte[1024];
            int tamanho;

            while ((tamanho = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, tamanho);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
