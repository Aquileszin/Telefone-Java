package Telefone;

import java.util.ArrayList;

public class Chamadas {
    private ArrayList<Ligacao> ligacoes;

    public Chamadas() {
        this.ligacoes = new ArrayList<Ligacao>();
    }

    public void adicionar(Ligacao ligacao) {
        this.ligacoes.add(ligacao);
    }

    @Override
    public String toString() {
        String historicoChamadas = "Histórico de Chamadas:\n";
        for (Ligacao ligacao : this.ligacoes) {
            historicoChamadas += ligacao + "\n";
        }
        return historicoChamadas;
    }
}
