package POO2.Cambio;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double cotacao, double quantidadeDolares) {
        double valorSemIOF = cotacao * quantidadeDolares;
        double imposto = valorSemIOF * IOF;
        return valorSemIOF + imposto;
    }
}