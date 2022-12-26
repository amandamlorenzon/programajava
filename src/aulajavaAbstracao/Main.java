package aulajavaAbstracao;

public class Main{
    public static void main(String[] args){

        Funcionario f1 = new Funcionario("João", "Rua 123, 5", "Eletrônicos", 2000.00, 6.0);
        Funcionario f2 = new Funcionario("Maria", "Rua do Avião, 2", "Material Escolar", 2500.00, 5.0);

        Cliente c1 = new Cliente("Marcos", "Rua sem Saida, 0", f1, 4200.00);

        System.out.println("O cliente " + c1.getNome() + "é atendido preferencialmente pelo funcionário " + c1.getAtendente().getNome());
        System.out.println("O salário do funcionário " + f2.getNome() + "é R$ " + f2.getSalario());
        f2.aumentarSalario(15);
        System.out.println("O salário deo funcionário " + f2.getNome() + "após um aumento de 15% é R$ " + f2.getSalario());
        
    }
}
