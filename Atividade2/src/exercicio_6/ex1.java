package exercicio_6;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Escolha uma opção: [adicionar, remover, listar, sair]");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "adicionar":
                    System.out.println("Digite a tarefa para adicionar:");
                    String taskToAdd = scanner.nextLine();
                    tasks.add(taskToAdd);
                    System.out.println("Tarefa adicionada!");
                    break;
                case "remover":
                    System.out.println("Digite a tarefa para remover:");
                    String taskToRemove = scanner.nextLine();
                    if (tasks.remove(taskToRemove)) {
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }
                    break;
                case "listar":
                    System.out.println("Lista de Tarefas:");
                    for (String task : tasks) {
                        System.out.println("- " + task);
                    }
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
            }
        } while (!command.equalsIgnoreCase("sair"));
    }

}
