package Ex7_HashMap;
import java.util.HashMap;
import java.util.Map;

public class ex7_iii_contato {
	private Map<String, String> contatos;

    public ex7_iii_contato() {
    	this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato '" + nome + "' adicionado com sucesso.");
    }

    public void buscarContato(String nome) {
        if (contatos.containsKey(nome)) {
            String telefone = contatos.get(nome);
            System.out.println("Nome: " + nome + ", Telefone: " + telefone);
        } else {
            System.out.println("Contato '" + nome + "' não encontrado na agenda.");
        }
    }

    public void listarContatos() {
        System.out.println("\nLista de Contatos:");
        for (Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
        }
    }
}
