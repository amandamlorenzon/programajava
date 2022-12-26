package aulaJavaPolimorfismo;

public class PizzaNapolitana {
    private double preco;
 
    public PizzaNapolitana(){
        preco = 32.0;
    }
 
    public void setPreco(double valor){
        preco = valor;
    }
 
    public String nome(){
        return "Napolitana";
    }
 
    public String ingredientes(){
        return "presunto, queijo, tomate, molho e orégano";
    }
 
    public int tempoForno(){
        return 18;
    }
 
    public double valor( char tam, int quant ){
        if( tam == 'P' ) return quant * preco * 0.9; // 10% de desconto
        if( tam == 'M' ) return quant * preco; 
        if( tam == 'G' ) return quant * preco * 1.1; // 10% de acréscimo
        return 0.0; // Tamanho não definido
    }
}
