package Ex5_DateCalendar;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex5_ii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data inicial (no formato yyyy-MM-dd): ");
        String dataStr = scanner.next();
        LocalDate data = LocalDate.parse(dataStr);

        System.out.println("Digite o número de dias para adicionar: ");
        int diasParaAdicionar = scanner.nextInt();

        scanner.close();

        LocalDate novaData = ex5_ii_adicionaDias.adicionaDias(data, diasParaAdicionar);

        // Formata a nova data para exibição
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String novaDataFormatada = novaData.format(formatter);

        System.out.println("Nova data após adicionar " + diasParaAdicionar + " dias: " + novaDataFormatada);
    }
}
