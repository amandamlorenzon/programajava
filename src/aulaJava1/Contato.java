package aulaJava1;
import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private List<Contato> contatos;

    public Contato() {
        contatos = new ArrayList<>();
    }

    public Contato adicionaContato(String nome, String email, String telefone) {
        Contato contato = new Contato();
        contato.nome = nome;
        contato.email = email;
        contato.telefone = telefone;
        contatos.add(contato);
        return contato;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public void listarContatos() {
        int posicoes = 0;
        for (Contato contato : contatos) {
            System.out.println("ID: "+ posicoes);
            System.out.println(contato.toString());
            System.out.println("-----------------------");
            posicoes++;
        }
    }

    public boolean existeContato(int index) {
        try {
            contatos.get(index);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public void deletarContato(int posicao) {
        contatos.remove(posicao);
    }

    public Contato editarContato(int index, String nome, String email, String telefone) {
        contatos.get(index).nome = nome;
        contatos.get(index).email = email;
        contatos.get(index).telefone = telefone;
        return contatos.get(index);
    }

}
