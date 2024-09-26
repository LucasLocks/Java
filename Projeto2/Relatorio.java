package Projeto2;

public class Relatorio {
    public static void gerarRelatorio(Bar bar) {
        System.out.println("\n### RELATÓRIO DE CONSUMO ###");
        System.out.printf("Consumo = R$ %.2f\n", bar.getConsumo());
        if (bar.getCouvert() == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", bar.getCouvert());
        }
        System.out.printf("Ingresso = R$ %.2f\n", bar.getIngresso());
        System.out.printf("Valor a pagar = R$ %.2f\n", bar.getValorTotal());
    }
}