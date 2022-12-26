package AT1Q2;

public class Casa extends Edificio implements CarbonFootprint {

    public Casa(double consumoMensal) {
        super(consumoMensal);
    }
    
    @Override 
    public String toString() {
        return String.format("%s: %.2f", "Consumo mensal é ", getMediaMensalEnergia() );
    }

    @Override
    public double getCarbonFootprint() {
        return getMediaMensalEnergia() * meses;
    }
}
