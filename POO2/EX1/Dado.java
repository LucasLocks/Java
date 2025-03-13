package POO2.EX1;

public class Dado {
    private int numeroAtual;
    
    public int rolar() {
        numeroAtual = (int) (Math.random() * 6) + 1;
        return numeroAtual;
    }
}