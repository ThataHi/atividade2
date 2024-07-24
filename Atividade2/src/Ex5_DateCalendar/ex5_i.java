package Ex5_DateCalendar;
import java.util.Scanner;
import java.time.LocalDate;

public class ex5_i {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data (no formato yyyy-MM-dd): ");
        String dataInicioStr = scanner.next();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr);

        System.out.println("Digite a segunda data (no formato yyyy-MM-dd): ");
        String dataFimStr = scanner.next();
        LocalDate dataFim = LocalDate.parse(dataFimStr);

        scanner.close();

        long diferencaEmDias = ex5_i_diferencaDias.calculaDiferencaEmDias(dataInicio, dataFim);

        System.out.println("A diferença em dias entre as datas é: " + diferencaEmDias + " dia(s).");
    }

}
