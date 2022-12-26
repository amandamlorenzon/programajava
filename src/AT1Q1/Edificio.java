package AT1Q1;

public class Edificio implements CarbonFootprint {
	
    private double mediaMensalEnergia;
    private final int meses = 12;

    public Edificio( double consumoMensal ) {
        mediaMensalEnergia = consumoMensal;
    }

    public void setMediaMensalEnergia( double consumoMensal ) {
        mediaMensalEnergia = consumoMensal;
    }

    public double getMediaMensalEnergia() {
        return mediaMensalEnergia;
    }

    @Override 
    public String toString() {
        return String.format("%s: %.2f", "Consumo mensal é ", getMediaMensalEnergia());
    }

    @Override
    public double getCarbonFootprint() {
        return getMediaMensalEnergia() * meses;
    }
}
