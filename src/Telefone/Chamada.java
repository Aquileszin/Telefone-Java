package Telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chamada {
    private String numeroOrigem;
    private String numeroDestino;
    private String horario;

    public Chamada(String numeroOrigem, String numeroDestino) {
        setNumeroOrigem(numeroOrigem);
        setNumeroDestino(numeroDestino);
    }

    public void ligar() {
        System.out.println("Ligando para " + getNumeroDestino());
        System.out.println("Chamando...");
        System.out.println("Número ocupado.\tTente novamente mais tarde.");
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        this.horario = formatadorData.format(horarioAgora);
    }

    @Override
    public String toString() {
        String historicoChamada = String.format("Origem: %s\t Destino: %s\t Horário: %s",
                this.numeroOrigem,
                this.numeroDestino,
                this.horario);
        return historicoChamada;
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
}
