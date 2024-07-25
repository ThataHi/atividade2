package Ex5_DateCalendar;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ex5_i_diferencaDias {
	public static long calculaDiferencaEmDias(LocalDate dataInicio, LocalDate dataFim) {
		// Calcula a diferença em dias entre as duas datas
		long diferencaEmDias = ChronoUnit.DAYS.between(dataInicio, dataFim);
	    return diferencaEmDias;
	 }
}
