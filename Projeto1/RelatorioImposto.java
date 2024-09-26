package Projeto1;

public class RelatorioImposto {
    private ImpostoRenda impostoRenda;

    public RelatorioImposto(ImpostoRenda impostoRenda) {
        this.impostoRenda = impostoRenda;
    }

    public void gerarRelatorio() {
        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoRenda.calcularImpostoSalario());
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoRenda.calcularImpostoServicos());
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoRenda.calcularImpostoCapital());
        System.out.println("\n* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", impostoRenda.calcularMaximoDedutivel());
        // Mostra o total de gastos dedutíveis sem aplicar o limite
        System.out.printf("Gastos dedutíveis totais: %.2f\n", impostoRenda.calcularTotalGastosDedutiveis());
        // Mostra os gastos dedutíveis após aplicar o limite
        System.out.printf("Gastos dedutíveis aplicados: %.2f\n", impostoRenda.calcularGastosDedutiveisAplicados());
        System.out.println("\n* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoRenda.calcularImpostoBruto());
        System.out.printf("Abatimento: %.2f\n", impostoRenda.calcularGastosDedutiveisAplicados());
        System.out.printf("Imposto devido: %.2f\n", impostoRenda.calcularImpostoDevido());
    }
}