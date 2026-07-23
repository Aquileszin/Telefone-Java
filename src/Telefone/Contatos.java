package Telefone;

import java.util.ArrayList;

public class Contatos {
    private ArrayList<Contato> contatos;

    public Contatos() {
        contatos = new ArrayList<Contato>();
    }

    public void adicionar(Contato contato) {
        this.contatos.add(contato);
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}
