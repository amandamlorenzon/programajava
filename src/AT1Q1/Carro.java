package AT1Q1;

public class Carro implements CarbonFootprint {

	private double quilometrosMes;
	private double mediaKmL;
	private final int EmissaoCO2PorKm = 5;

	public Carro(double quilometros, double KmL) {
		quilometrosMes = quilometros;
		mediaKmL = KmL;
	}

	public void setQuilometrosAnuais(double quilometros) {
		quilometrosMes = quilometros;
	}

	public void setMediaMPG(double KmL) {
		mediaKmL = KmL;
	}

	public double getQuilometrosMes() {
		return quilometrosMes;
	}

	public double getMediaKmL() {
		return mediaKmL;
	}

	@Override
	public String toString() {
		return String.format( "%s: %.2f \n%s: %.2f ",
				"Media mensal por quilometro ", getQuilometrosMes(),
				"Media KM/L é ", getMediaKmL());
	}

	@Override
	public double getCarbonFootprint() {
		return ((getQuilometrosMes() * getMediaKmL()) * EmissaoCO2PorKm);
	}
}
