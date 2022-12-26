package aulajavaAbstracao;
public abstract class Pessoa {
    
    public String nome;
    public String endereco;

    public void setNome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String e){
        endereco = e;
    }

    public String getEndereco(){
        return endereco;
    }
}
