package POO2.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura e altura do retângulo:");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Rectangle retangulo = new Rectangle(largura, altura);

        System.out.println("\n" + retangulo);

        sc.close();
    }
}