package Projeto2;

public class Bar {
    private char sexo;
    private int qtdCervejas;
    private int qtdRefrigerantes;
    private int qtdEspetinhos;

    public Bar(char sexo, int qtdCervejas, int qtdRefrigerantes, int qtdEspetinhos) {
        this.sexo = sexo;
        this.qtdCervejas = qtdCervejas;
        this.qtdRefrigerantes = qtdRefrigerantes;
        this.qtdEspetinhos = qtdEspetinhos;
    }

    public double calcularConsumo() {
        return (qtdCervejas * 5) + (qtdRefrigerantes * 3) + (qtdEspetinhos * 7);
    }

    public double calcularCouvert() {
        return calcularConsumo() > 30 ? 0 : 4;
    }

    public double calcularIngresso() {
        return sexo == 'M' ? 10 : 8;
    }

    public double calcularValorTotal() {
        return calcularConsumo() + calcularCouvert() + calcularIngresso();
    }

    public char getSexo() {
        return sexo;
    }

    public double getConsumo() {
        return calcularConsumo();
    }

    public double getCouvert() {
        return calcularCouvert();
    }

    public double getIngresso() {
        return calcularIngresso();
    }

    public double getValorTotal() {
        return calcularValorTotal();
    }
}