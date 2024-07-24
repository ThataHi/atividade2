package Ex3_Math;

public class ex3_i_hipotenusa {
	public static double calculaHipotenusa(double cateto1, double cateto2) {
        // Aplica o teorema de Pitágoras
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return hipotenusa;
    }
}
