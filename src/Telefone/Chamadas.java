package Telefone;

public class Chamadas {
    private String numeroOrigem;
    private String numeroDestino;
    private String horario;

    public Chamadas(String numeroOrigem, String numeroDestino) {
        setNumeroOrigem(numeroOrigem);
        setNumeroDestino(numeroDestino);
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
