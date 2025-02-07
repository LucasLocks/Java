package POO2.Cambio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double quantidadeDolares = sc.nextDouble();

        double valorEmReais = CurrencyConverter.converter(cotacao, quantidadeDolares);

        System.out.printf("Valor a ser pago em reais = %.2f%n", valorEmReais);

        sc.close();
    }
}