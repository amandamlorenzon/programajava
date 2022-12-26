package AT1Q2;

public abstract class Edificio {

    public double mediaMensalEnergia;
    public final int meses = 12;

    public Edificio(double consumoMensal) {
        mediaMensalEnergia = consumoMensal;
    }

    public void setMediaMensalEnergia(double consumoMensal) {
        mediaMensalEnergia = consumoMensal;
    }

    public double getMediaMensalEnergia() {
        return mediaMensalEnergia;
    }

}
