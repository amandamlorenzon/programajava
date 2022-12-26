package aulajavaAbstracao;
public class Funcionario extends Pessoa {
    private String setor;
    private double salario;
    private double comissao;

    public Funcionario(String n, String e, String s, double x, double c){
        setor = s;
        salario = x;
        comissao = c;
        super.nome = n;
        super.endereco = e;
    }

    public void setSetor(String s){
        setor = s;
    }

    public String getSetor(){
        return setor;
    }

    public void setSalario(float s){
        salario = s;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(float porcentagem){
        salario = salario * porcentagem / 100;
    }

    public void setComissao(float s){
        comissao = s;
    }

    public double getComissao(){
        return comissao;
    }

    public double calcularComissao(double venda){
        double res;
        res = venda * comissao / 100;
        return res;
    }
}
