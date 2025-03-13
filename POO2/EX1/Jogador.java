package POO2.EX1;


public class Jogador {
    private int casaAtual;
    private int meuNumero;
    
    public Jogador(int numero) {
        this.meuNumero = numero;
        this.casaAtual = 0;
    }
    
    public void jogar(int numeroSorteado) {
        casaAtual += numeroSorteado;
    }
    
    public int getCasaAtual() {
        return casaAtual;
    }
    
    public int getNumero() {
        return meuNumero;
    }

    public void resetar() {
        casaAtual = 0;
    }
}