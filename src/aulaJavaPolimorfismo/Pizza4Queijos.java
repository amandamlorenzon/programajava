package aulaJavaPolimorfismo;

public class Pizza4Queijos {
    private double preco;
 
    public Pizza4Queijos(){
        preco = 30.0;
    }
    
    public void setPreco(double valor){
        preco = valor;
    }
    public String nome(){
        return "4 Queijos";
    }
    
    public String ingredientes(){
        return "mussarela, provolone, gorgonzola, parmesão e molho";
    }
    
    public int tempoForno(){
        return 15;
    }
    
    public double valor( char tam, int quant ){
        if( tam == 'P' ) return quant * preco * 0.9; // 10% de desconto
        if( tam == 'M' ) return quant * preco; 
        if( tam == 'G' ) return quant * preco * 1.1; // 10% de acréscimo
        return 0.0; // Tamanho não definido
    }
}
