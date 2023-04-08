package dominio;

public enum CorSemaforo {
    VERDE(2000),
    AMARELO(300),
    VERMELHO(1000);

    private int tempoEspera;

    CorSemaforo(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
