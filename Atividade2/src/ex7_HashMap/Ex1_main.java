package Ex7_HashMap;
import java.util.Scanner;

public class ex7_i {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex7_i_inventarioProtudos inventario = new ex7_i_inventarioProtudos();

        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Buscar Produto por Nome");
            System.out.println("4. Listar Todos os Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline após nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir o newline após nextInt()
                    inventario.adicionarProduto(nome, quantidade);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    inventario.removerProduto(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do produto a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    inventario.buscarProduto(nomeBuscar);
                    break;
                case 4:
                    inventario.listarProdutos();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
