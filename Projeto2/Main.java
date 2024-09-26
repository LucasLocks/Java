package Projeto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados
        char sexo = obterSexo(scanner);
        int qtdCervejas = obterQuantidade(scanner, "Quantidade de cervejas: ");
        int qtdRefrigerantes = obterQuantidade(scanner, "Quantidade de refrigerantes: ");
        int qtdEspetinhos = obterQuantidade(scanner, "Quantidade de espetinhos: ");

        // Criação do objeto Bar
        Bar bar = new Bar(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);

        // Geração do relatório
        Relatorio.gerarRelatorio(bar);
    }

    private static char obterSexo(Scanner scanner) {
        char sexo;
        while (true) {
            System.out.print("Sexo (F ou M): ");
            sexo = scanner.next().toUpperCase().charAt(0); // Convertendo para maiúscula
            if (sexo == 'F' || sexo == 'M') {
                break; // Saia do loop se a entrada for válida
            } else {
                System.out.println("Entrada inválida! Por favor, insira 'F' ou 'M'.");
            }
        }
        return sexo;
    }

    private static int obterQuantidade(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
}