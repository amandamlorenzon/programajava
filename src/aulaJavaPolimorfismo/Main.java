package aulaJavaPolimorfismo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao = 0, quant = 1, numero = 1;
        String tamanho = "M";

        Scanner sc = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println("\nEntre com a opção ([1]Calabresa [2]Napolitana [3]4 Queijos [4]Fim)?");
            opcao = sc.nextInt();
            if(opcao == 1 || opcao == 2 || opcao == 3) {
                System.out.println("\nQual o tamanho (P/M/G)?");
                tamanho = sc.next();
                System.out.println("\nQuantas pizzas você deseja?");
                quant = sc.nextInt();
                if(quant < 1) {
                    System.out.println("\nErro: a quantidade de pizzas deve ser maior que zero!");
                    continue;
                }
                System.out.println();
            }

        Pedido pedido = new Pedido(numero, tamanho.charAt(0), quant);
        numero++;

        switch(opcao){
            case 1: PizzaCalabresa calabresa = new PizzaCalabresa();
                pedido.fazer(calabresa);
                break;
            case 2: PizzaNapolitana napolitana = new PizzaNapolitana();
                pedido.fazer(napolitana);
                break;
            case 3: Pizza4Queijos queijos = new Pizza4Queijos();
                pedido.fazer(queijos);
                break;
            case 4: break;
            default: System.out.println("Erro: opção inválida!");
                break;
            }
        System.out.println();
        }
    sc.close();
    }

}