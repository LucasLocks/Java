package Projeto3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t### INÍCIO DO COMBATE ! ###");
        System.out.println("\nDigite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();

        int vida1 = solicitarValorPositivo("Vida inicial: ", scanner);
        int ataque1 = solicitarValorMinimo("Ataque: ", 1, scanner);
        int armadura1 = solicitarValorMinimo("Armadura: ", 0, scanner);

        Campeao campeao1 = new Campeao(nome1, vida1, ataque1, armadura1);

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();

        int vida2 = solicitarValorPositivo("Vida inicial: ", scanner);
        int ataque2 = solicitarValorMinimo("Ataque: ", 1, scanner);
        int armadura2 = solicitarValorMinimo("Armadura: ", 0, scanner);

        Campeao campeao2 = new Campeao(nome2, vida2, ataque2, armadura2);

        int turnos = solicitarValorEntre("\nQuantos turnos você deseja executar? ", 1, 20, scanner);

        Combate combate = new Combate(campeao1, campeao2, turnos);
        combate.iniciar();

        scanner.close();
    }

    private static int solicitarValorPositivo(String mensagem, Scanner scanner) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            if (valor > 0) break;
            System.out.println("\nO valor deve ser maior que zero !");
        }
        scanner.nextLine();
        return valor;
    }

    private static int solicitarValorMinimo(String mensagem, int minimo, Scanner scanner) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            if (valor >= minimo) break;
            System.out.println("\nO valor deve ser maior ou igual a " + minimo + " !");
        }
        scanner.nextLine();
        return valor;
    }

    private static int solicitarValorEntre(String mensagem, int min, int max, Scanner scanner) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            if (valor >= min && valor <= max) break;
            System.out.println("\nO valor deve estar entre " + min + " e " + max + " !");
        }
        scanner.nextLine();
        return valor;
    }
}