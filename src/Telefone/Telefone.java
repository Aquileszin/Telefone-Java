package Telefone;

public class Telefone {
    private String numeroChip;
    private Contatos contatos;

    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        contatos = new Contatos();
    }

    public void adicionarContato(Contato contato) {
        contatos.adicionar(contato);
    }

    public Contatos buscar(String nome) {
        return contatos.buscar(nome);
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public Contatos getContatos() {
        return contatos;
    }
}
