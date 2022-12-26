package aulajavaAbstracao;

public class Cliente extends Pessoa {
    private Funcionario atendente;
    private double limite_compras;

    public Cliente(String n, String e, Funcionario f, double l){
        atendente = f;
        limite_compras = l;
        super.nome = n;
        super.endereco = e;
    }
    
    public void setAtendente(Funcionario f){
        atendente = f;
    }

    public Funcionario getAtendente(Funcionario f){
        return atendente;
    }

    public Funcionario getAtendente(){
        return atendente;
    }

    public void setLimiteCompras(double l){
        limite_compras = l;
    }

    public double getLimiteCompras(){
        return limite_compras;
    }
}
