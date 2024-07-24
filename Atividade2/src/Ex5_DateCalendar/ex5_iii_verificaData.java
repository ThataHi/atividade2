package Ex5_DateCalendar;
import java.time.LocalDate;

public class ex5_iii_verificaData {
	public static String comparaDatas(LocalDate data1, LocalDate data2) {
        // Verifica se data1 é anterior, igual ou posterior a data2
        if (data1.isBefore(data2)) {
            return "A primeira data (" + data1 + ") é antes da segunda data (" + data2 + ").";
        } else if (data1.isAfter(data2)) {
            return "A primeira data (" + data1 + ") é depois da segunda data (" + data2 + ").";
        } else {
            return "As duas datas são iguais.";
        }
    }
}
