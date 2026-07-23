package Telefone;

public class Telefone {
    private String numeroChip;
    private Contatos contatos;

    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        contatos = new Contatos();
    }
}
