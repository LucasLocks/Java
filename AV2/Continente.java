package AV2;

import java.util.*;

public class Continente {
    private String nome;
    private Set<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public Set<Pais> getPaises() {
        return paises;
    }

    public double calcularDimensaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getArea();
        }
        return total;
    }

    public double calcularPopulacaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    public double calcularDensidadePopulacional() {
        return calcularPopulacaoTotal() / calcularDimensaoTotal();
    }

    public Pais getPaisComMaiorPopulacao() {
        return paises.stream().max(Comparator.comparingDouble(Pais::getPopulacao)).orElse(null);
    }

    public Pais getPaisComMenorPopulacao() {
        return paises.stream().min(Comparator.comparingDouble(Pais::getPopulacao)).orElse(null);
    }

    public Pais getPaisDeMaiorDimensao() {
        return paises.stream().max(Comparator.comparingDouble(Pais::getArea)).orElse(null);
    }

    public Pais getPaisDeMenorDimensao() {
        return paises.stream().min(Comparator.comparingDouble(Pais::getArea)).orElse(null);
    }
}