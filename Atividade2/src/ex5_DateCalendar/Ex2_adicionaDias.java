package Ex5_DateCalendar;
import java.time.LocalDate;

public class ex5_ii_adicionaDias {
	 public static LocalDate adicionaDias(LocalDate data, int diasParaAdicionar) {
	        // Adiciona os dias especificados à data fornecida
	        LocalDate novaData = data.plusDays(diasParaAdicionar);
	        return novaData;
	    }
}
