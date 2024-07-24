package Ex7_HashMap;
import java.util.Scanner;

public class ex7_iii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex7_iii_contato agenda = new ex7_iii_contato();

        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato por Nome");
            System.out.println("3. Listar Todos os Contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline após nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    agenda.buscarContato(nomeBuscar);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
