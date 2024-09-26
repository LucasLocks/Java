package Projeto1;

public class ImpostoRenda {
    private Contribuinte contribuinte;

    public ImpostoRenda(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public double calcularImpostoSalario() {
        double salarioMensal = contribuinte.getRendaSalario() / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return contribuinte.getRendaSalario() * 0.10;
        } else {
            return contribuinte.getRendaSalario() * 0.20;
        }
    }

    public double calcularImpostoServicos() {
        return contribuinte.getRendaServicos() * 0.15;
    }

    public double calcularImpostoCapital() {
        return contribuinte.getRendaCapital() * 0.20;
    }

    public double calcularImpostoBruto() {
        return calcularImpostoSalario() + calcularImpostoServicos() + calcularImpostoCapital();
    }

    public double calcularMaximoDedutivel() {
        return calcularImpostoBruto() * 0.30;
    }

    public double calcularTotalGastosDedutiveis() {
        // Retorna o total de gastos médicos e educacionais, sem aplicar o limite
        return contribuinte.getTotalGastosDedutiveis();
    }

    public double calcularGastosDedutiveisAplicados() {
        double totalGastos = calcularTotalGastosDedutiveis();
        double maximoDedutivel = calcularMaximoDedutivel();
        // Aplica o menor valor entre o total de gastos e o máximo dedutível
        return Math.min(totalGastos, maximoDedutivel);
    }

    public double calcularImpostoDevido() {
        return calcularImpostoBruto() - calcularGastosDedutiveisAplicados();
    }
}