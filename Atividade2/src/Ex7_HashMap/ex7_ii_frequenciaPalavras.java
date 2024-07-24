package Ex7_HashMap;
import java.util.HashMap;
import java.util.Map;

public class ex7_ii_frequenciaPalavras {
	private Map<String, Integer> frequenciaPalavras;

    public ex7_ii_frequenciaPalavras() {
        this.frequenciaPalavras = new HashMap<>();
    }

    public void contarPalavras(String texto) {
        // Limpar o texto de caracteres especiais e dividir em palavras
        String[] palavras = texto.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Contar a frequência de cada palavra
        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                int frequencia = frequenciaPalavras.getOrDefault(palavra, 0);
                frequenciaPalavras.put(palavra, frequencia + 1);
            }
        }
    }

    public void exibirFrequencia() {
        System.out.println("\nFrequência de Palavras:");
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
