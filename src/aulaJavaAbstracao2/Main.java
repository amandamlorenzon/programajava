package aulaJavaAbstracao2;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro ("1.8", "XYZ", "Ford", 13.5, 5, "Focus", "Ford", "Azul");
        Carro c2 = new Carro ("1.0", "ZYX", "Renault", 18.5, 5, "Logan", "Renault", "Bordô");
        
        System.out.println("Motor do Carro 1: " + c1.getPotenciaMotor() + " " + c1.getFabricanteMotor() + " " + c1.getModeloMotor());
        System.out.println("Veículo do Carro 1: " + c1.getPassageiros() + " passageiros " + c1.getFabricanteVeiculo() + " " + c1.getModeloVeiculo() + 
        " " + c1.getConsumo() + " Km/L");
        System.out.println("Motor do Carro 2: " + c2.getPotenciaMotor() + " " + c2.getFabricanteMotor() + " " + c2.getModeloMotor());
        System.out.println("Veículo do Carro 2: " + c2.getPassageiros() + " passageiros " + c2.getFabricanteVeiculo() + " " + c2.getModeloVeiculo() +
        " " + c2.getConsumo() + " Km/L" );
    }
    
}
