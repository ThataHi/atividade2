package Ex5_DateCalendar;
import java.time.LocalDate;
import java.util.Scanner;

public class ex5_iii {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data (no formato yyyy-MM-dd): ");
        String data1Str = scanner.next();
        LocalDate data1 = LocalDate.parse(data1Str);

        System.out.println("Digite a segunda data (no formato yyyy-MM-dd): ");
        String data2Str = scanner.next();
        LocalDate data2 = LocalDate.parse(data2Str);

        scanner.close();

        String resultado = ex5_iii_verificaData.comparaDatas(data1, data2);

        System.out.println(resultado);
    }
}
