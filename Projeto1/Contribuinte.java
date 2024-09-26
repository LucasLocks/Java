package Projeto1;

public class Contribuinte {
    private double rendaSalario;
    private double rendaServicos;
    private double rendaCapital;
    private double gastosMedicos;
    private double gastosEducacionais;

    public Contribuinte(double rendaSalario, double rendaServicos, double rendaCapital, double gastosMedicos, double gastosEducacionais) {
        this.rendaSalario = rendaSalario;
        this.rendaServicos = rendaServicos;
        this.rendaCapital = rendaCapital;
        this.gastosMedicos = gastosMedicos;
        this.gastosEducacionais = gastosEducacionais;
    }

    public double getRendaSalario() {
        return rendaSalario;
    }

    public double getRendaServicos() {
        return rendaServicos;
    }

    public double getRendaCapital() {
        return rendaCapital;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }

    public double getTotalGastosDedutiveis() {
        return gastosMedicos + gastosEducacionais;
    }
}