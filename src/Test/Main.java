package Test;

import Telefone.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá GitHub!");
        Telefone telefone = new Telefone("4002 8922");
        Contato contatoA = new Contato("Carlos", "72 9823-4182");
        Contato contatoB = new Contato("Carmelita", "23 4219-8192");
        Contato contatoC = new Contato("Buttowski", "82 9123-1236");

        telefone.adicionarContato(contatoA);
        telefone.adicionarContato(contatoB);
        telefone.adicionarContato(contatoC);


        System.out.println(telefone.buscar("CAR"));
    }
}
