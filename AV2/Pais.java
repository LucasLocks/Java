package AV2;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String nome;
    private String codigoIso;
    private double populacao;
    private double area;
    private Set<Pais> vizinhos;

    // Construtor
    public Pais(String nome, String codigoIso, double populacao, double area) {
        this.nome = nome;
        this.codigoIso = codigoIso;
        this.populacao = populacao;
        this.area = area;
        this.vizinhos = new HashSet<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Set<Pais> getVizinhos() {
        return vizinhos;
    }

    public void adicionarVizinho(Pais vizinho) {
        this.vizinhos.add(vizinho);
    }

    // Método para calcular a densidade populacional
    public double calcularDensidadePopulacional() {
        if (area == 0) {
            return 0;
        }
        return Math.round((populacao / area) * 100.0) / 100.0;
    }

    // Método para imprimir as informações do país
    public void imprimirInformacoes() {
        System.out.printf("Nome: %s\nCódigo ISO: %s\nPopulação: %.2f\nÁrea: %.2f km²\nDensidade Populacional: %.2f habitantes/km²\n", 
                          nome, codigoIso, populacao, area, calcularDensidadePopulacional());
    }

    // Método para imprimir vizinhos
    public void imprimirVizinhos() {
        if (vizinhos.isEmpty()) {
            System.out.println("Nenhum vizinho encontrado.");
        } else {
            System.out.println("Vizinhos:");
            for (Pais vizinho : vizinhos) {
                System.out.println("- " + vizinho.getNome() + " (Código ISO: " + vizinho.getCodigoIso() + ")");
            }
        }
    }
}