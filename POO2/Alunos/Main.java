package POO2.Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Nota do primeiro trimestre: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota do segundo trimestre: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota do terceiro trimestre: ");
        double nota3 = sc.nextDouble();

        Student aluno = new Student(nome, nota1, nota2, nota3);

        System.out.println("\n" + aluno);

        sc.close();
    }
}