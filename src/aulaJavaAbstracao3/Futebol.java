package aulaJavaAbstracao3;

// Interface Futebol (Futebol.java)
public interface Futebol extends Esporte {
    public static final int NUM_JOGADORES = 11;

    public void setIntervalo(double tempo);
    public double getIntervalo();
}
