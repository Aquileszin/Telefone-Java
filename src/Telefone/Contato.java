package Telefone;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        setNome(nome);
        setNumero(numero);
    }

    @Override
    public String toString() {
        String informacao = String.format("Nome: %s\t Numero: %s", this.nome, this.numero);
        return informacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
