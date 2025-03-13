package POO2.EX1;

class Tabuleiro {
    private int numeroCasas;

    public Tabuleiro(int numeroCasas) {
        if (numeroCasas <= 0) {
            throw new IllegalArgumentException("O número de casas deve ser maior que zero.");
        }
        this.numeroCasas = numeroCasas;
    }

    public int getNumeroCasas() {
        return numeroCasas;
    }
}
