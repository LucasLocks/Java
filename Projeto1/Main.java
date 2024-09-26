package Projeto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Renda anual com salário: ");
        double rendaSalario = scanner.nextDouble();
        
        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServicos = scanner.nextDouble();
        
        System.out.print("Renda anual com ganho de capital: ");
        double rendaCapital = scanner.nextDouble();
        
        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();
        
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();
        
        Contribuinte contribuinte = new Contribuinte(rendaSalario, rendaServicos, rendaCapital, gastosMedicos, gastosEducacionais);
        ImpostoRenda impostoRenda = new ImpostoRenda(contribuinte);
        RelatorioImposto relatorio = new RelatorioImposto(impostoRenda);
        
        relatorio.gerarRelatorio();
        
        scanner.close();
    }
}