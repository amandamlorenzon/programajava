package aulaJavaPolimorfismo;

public class PizzaCalabresa {
    
    private double preco;

    public PizzaCalabresa() {
        preco = 35.00;
    }
    
    public void setPreco(double valor) {
        preco = valor;
    }

    public String nome(){
        return "Calabresa";
    }

    public String ingredientes() {
        return "calabresa, cebola, tomate e queijo";
    }

    public int tempoForno() {
        return 20;
    }

    public double valor(char tam, int quant) {
        if(tam == 'P') return quant * preco; //10% de desconto
        if(tam == 'M') return quant * preco;
        if(tam == 'G') return quant * preco * 1.1; // 10% de acrécimo
        return 0.0; //Tamanho não definido
    }
}
