package aulaJava1;
import java.util.Scanner;

public class Programa {

    Contato agenda = new Contato();

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.chamaMenu();
    }

    public void chamaMenu() {
        apresentaMenu();
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        executarMenu(opcao);
        sc.close();
    }

    public static void apresentaMenu() {
        System.out.println("Selecione uma das op��es");
        System.out.println("1 - Listar Contatos");
        System.out.println("2 - Criar Contato");
        System.out.println("3 - Editar Contato");
        System.out.println("4 - Deletar Contato");
        System.out.println("--------------------------");
    }

    /**
     * @param opcao
     */
    public void executarMenu(Integer opcao) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String email;
        String telefone;
        int posicao = -1;
        switch (opcao) {
            case 1:
                System.out.println("Escolheu listar contatos");
                agenda.listarContatos();
                break;
            case 2:
                System.out.println("Escolheu criar contato");
                System.out.println("Digite o nome");
                nome = sc.nextLine();
                System.out.println("Digite o email");
                email = sc.nextLine();
                System.out.println("Digite o telefone");
                telefone = sc.nextLine();
                agenda.adicionaContato(nome, email, telefone);
                break;
            case 3:
                System.out.println("Escolheu editar contato\n");
                System.out.println("Selecione uma das op��es da lista");
                agenda.listarContatos();
                posicao = -1;
                while (posicao < 0 || !agenda.existeContato(posicao)) {
                    System.out.println("Digite o ID do contato v�lido");
                    posicao = sc.nextInt();
                }
                System.out.println("Digite o nome: ");
                nome = sc.nextLine();
                System.out.println("Digite o email: ");
                email = sc.nextLine();
                System.out.println("Digite o telefone: ");
                telefone = sc.nextLine();
                agenda.editarContato(posicao,nome,email,telefone);
                break;
            case 4:
                System.out.println("Escolheu deletar contato");
                System.out.println("Selecione uma das op��es da lista");
                agenda.listarContatos();
                posicao = -1;
                while (posicao < 0 || !agenda.existeContato(posicao)) {
                    System.out.println("Digite o ID do contato v�lido");
                    posicao = sc.nextInt();
                }
                agenda.deletarContato(posicao);
                break;
            default:
                chamaMenu();   
        }
        sc.close();
        chamaMenu(); 
    }
    
}

