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

    public Contatos buscar(String buscarNome) {
        Contatos filtro = new Contatos();
        String buscarNomeMinusculo = buscarNome.toLowerCase();
        for (Contato contato : contatos) {
            String nomeContatoMinusculo = contato.getNome().toLowerCase();
            if (nomeContatoMinusculo.startsWith(buscarNomeMinusculo)) {
                filtro.adicionar(contato);
            }
        }
        return filtro;
    }

    @Override
    public String toString() {
        String listaDeContatos = "Contatos:\n";
        for (Contato contato : this.contatos) {
            listaDeContatos += contato + "\n";
        }
        return listaDeContatos;
    }


    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}
