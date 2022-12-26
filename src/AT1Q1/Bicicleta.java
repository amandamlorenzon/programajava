package AT1Q1;

public class Bicicleta implements CarbonFootprint {

	private double quilometrosMes;
	private final int caloriasPorQuilometro = 60;

	public Bicicleta(double quilometros) {
		quilometrosMes = quilometros;
	}

	public void setKilometroAno(double quilometros) {
		quilometrosMes = quilometros;
	}

	public double getQuilometrosMes() {
		return quilometrosMes;
	}

	@Override
	public String toString() {
		return String.format("%s: %.2f", "Kilometros anuais ", getQuilometrosMes());
	}

	@Override
	public double getCarbonFootprint() {
		return quilometrosMes * caloriasPorQuilometro;
	}
}
