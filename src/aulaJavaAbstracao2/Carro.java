package aulaJavaAbstracao2;

public class Carro implements Veiculo,Motor {
    
    private String potencia;
    private String modelo_motor;
    private String fab_motor;
    private double consumo;
    private int passageiros;
    private String modelo_veiculo;
    private String fab_veiculo;
    private String cor;

    public Carro(String p, String mm, String fm, double c, int x, String mv, String fv, String cr) {

        potencia = p;
        modelo_motor = mm;
        fab_motor = fm;
        consumo = c;
        passageiros = x;
        modelo_veiculo = mv;
        fab_veiculo = fv;
        cor = cr;
    }

    @Override
    public String getPotenciaMotor() {
        return potencia;
    }

    @Override
    public String getModeloMotor() {
        return modelo_motor;
    }

    @Override
    public String getFabricanteMotor() {
        return fab_motor;
    }

    @Override
    public double getConsumo() {
        return consumo;
    }

    @Override
    public int getPassageiros() {
        return passageiros;
    }

    @Override
    public String getModeloVeiculo() {
        return modelo_veiculo;
    }

    @Override
    public String getFabricanteVeiculo() {
        return fab_veiculo;
    }

    @Override
    public String getCor() {
        return cor;
    }
}
