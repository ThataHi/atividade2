package Ex7_HashMap;
import java.util.HashMap;
import java.util.Map;

public class ex7_i_inventarioProtudos {
	private Map<String, Integer> inventario;

    public ex7_i_inventarioProtudos() {
        this.inventario = new HashMap<>();
    }

    public void adicionarProduto(String nomeProduto, int quantidade) {
        inventario.put(nomeProduto, quantidade);
        System.out.println("Produto '" + nomeProduto + "' adicionado ao inventário.");
    }

    public void removerProduto(String nomeProduto) {
        if (inventario.containsKey(nomeProduto)) {
            inventario.remove(nomeProduto);
            System.out.println("Produto '" + nomeProduto + "' removido do inventário.");
        } else {
            System.out.println("Produto '" + nomeProduto + "' não encontrado no inventário.");
        }
    }

    public void buscarProduto(String nomeProduto) {
        if (inventario.containsKey(nomeProduto)) {
            int quantidade = inventario.get(nomeProduto);
            System.out.println("Produto '" + nomeProduto + "' encontrado. Quantidade: " + quantidade);
        } else {
            System.out.println("Produto '" + nomeProduto + "' não encontrado no inventário.");
        }
    }

    public void listarProdutos() {
        System.out.println("\nInventário de Produtos:");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
        System.out.println();
    }
}
