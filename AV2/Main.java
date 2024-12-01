package AV2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando países para a América do Sul
        Pais brasil = new Pais("Brasil", "BRA", 211000000, 8516000);
        Pais argentina = new Pais("Argentina", "ARG", 45195777, 2780000);
        Pais chile = new Pais("Chile", "CHI", 19116209, 756950);
        Pais paraguai = new Pais("Paraguai", "PAR", 7132530, 406750);
        Pais bolivia = new Pais("Bolívia", "BOL", 11673021, 1098581);

        // Criando países para a América do Norte
        Pais eua = new Pais("Estados Unidos", "EUA", 331000000, 9833517);
        Pais canada = new Pais("Canadá", "CAN", 38000000, 9976140);
        Pais mexico = new Pais("México", "MEX", 126190788, 1964375);
        Pais cuba = new Pais("Cuba", "CUB", 11326616, 109884);
        Pais guatemala = new Pais("Guatemala", "GTM", 17614637, 108889);

        // Criando países para a Europa
        Pais franca = new Pais("França", "FRA", 65273511, 551695);
        Pais alemanha = new Pais("Alemanha", "DEU", 83149300, 357022);
        Pais espanha = new Pais("Espanha", "ESP", 46754783, 505992);
        Pais italia = new Pais("Itália", "ITA", 60244639, 301340);
        Pais portugal = new Pais("Portugal", "PRT", 10305557, 92212);

       // Definindo vizinhos dos países da América do Sul
        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(chile);
        brasil.adicionarVizinho(paraguai);
        brasil.adicionarVizinho(bolivia);

        argentina.adicionarVizinho(brasil);
        argentina.adicionarVizinho(chile);
        argentina.adicionarVizinho(paraguai);
        argentina.adicionarVizinho(bolivia);

        paraguai.adicionarVizinho(brasil);
        paraguai.adicionarVizinho(argentina);

        chile.adicionarVizinho(brasil);
        chile.adicionarVizinho(argentina);

        bolivia.adicionarVizinho(brasil);
        bolivia.adicionarVizinho(argentina);

        // Definindo vizinhos dos países da América do Norte
        eua.adicionarVizinho(canada);
        eua.adicionarVizinho(mexico);

        canada.adicionarVizinho(eua);
        mexico.adicionarVizinho(eua);
        mexico.adicionarVizinho(guatemala);

        guatemala.adicionarVizinho(mexico);
        guatemala.adicionarVizinho(cuba);

        // Definindo vizinhos dos países da Europa
        franca.adicionarVizinho(alemanha);
        franca.adicionarVizinho(espanha);
        franca.adicionarVizinho(portugal);

        alemanha.adicionarVizinho(franca);
        alemanha.adicionarVizinho(espanha);
        alemanha.adicionarVizinho(italia);

        espanha.adicionarVizinho(franca);
        espanha.adicionarVizinho(alemanha);
        espanha.adicionarVizinho(portugal);

        italia.adicionarVizinho(alemanha);
        italia.adicionarVizinho(franca);

        portugal.adicionarVizinho(franca);
        portugal.adicionarVizinho(espanha);

        List<Pais> todosOsPaises = Arrays.asList(brasil, argentina, chile, paraguai, bolivia, eua, canada, mexico, cuba, guatemala, franca, alemanha, espanha, italia, portugal);
        
        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(chile);
        americaDoSul.adicionarPais(paraguai);
        americaDoSul.adicionarPais(bolivia);

        Continente americaDoNorte = new Continente("América do Norte");
        americaDoNorte.adicionarPais(eua);
        americaDoNorte.adicionarPais(canada);
        americaDoNorte.adicionarPais(mexico);
        americaDoNorte.adicionarPais(cuba);
        americaDoNorte.adicionarPais(guatemala);

        Continente europa = new Continente("Europa");
        europa.adicionarPais(franca);
        europa.adicionarPais(alemanha);
        europa.adicionarPais(espanha);
        europa.adicionarPais(italia);
        europa.adicionarPais(portugal);

        List<Continente> continentes = Arrays.asList(americaDoSul, americaDoNorte, europa);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Informações de um Continente");
            System.out.println("2. Ver densidade populacional de um país");
            System.out.println("3. Ver razão territorial do maior país em relação ao menor país");
            System.out.println("4. Ver países vizinhos comuns entre dois países");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    mostrarInformacoesContinente(continentes);
                    break;
                case 2:
                    mostrarDensidadePopulacional(todosOsPaises);
                    break;
                case 3:
                    mostrarRazaoTerritorial(todosOsPaises);
                    break;
                case 4:
                    mostrarVizinhosComuns(todosOsPaises);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void mostrarInformacoesContinente(List<Continente> continentes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelecione um continente:");
        for (int i = 0; i < continentes.size(); i++) {
            System.out.println((i + 1) + ". " + continentes.get(i).getNome());
        }
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine(); 
        Continente continenteEscolhido = continentes.get(escolha - 1);

        System.out.println("\nInformações do continente " + continenteEscolhido.getNome() + ":");
        System.out.printf("Dimensão total: %.2f km²\n", continenteEscolhido.calcularDimensaoTotal());
        System.out.printf("População total: %.2f de pessoas\n", continenteEscolhido.calcularPopulacaoTotal());
        System.out.printf("Densidade populacional: %.2f habitantes por km²\n", continenteEscolhido.calcularDensidadePopulacional());
        System.out.println("País com maior população: " + continenteEscolhido.getPaisComMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + continenteEscolhido.getPaisComMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial: " + continenteEscolhido.getPaisDeMaiorDimensao().getNome());
        System.out.println("País de menor dimensão territorial: " + continenteEscolhido.getPaisDeMenorDimensao().getNome());
    }

    public static void mostrarDensidadePopulacional(List<Pais> todosOsPaises) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelecione um país para ver sua densidade populacional:");
        for (int i = 0; i < todosOsPaises.size(); i++) {
            System.out.println((i + 1) + ". " + todosOsPaises.get(i).getNome());
        }
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine(); 
        Pais paisEscolhido = todosOsPaises.get(escolha - 1);

        System.out.printf("\nDensidade populacional de %s: %.2f habitantes por km²\n", paisEscolhido.getNome(), paisEscolhido.calcularDensidadePopulacional());
    }

    public static void mostrarRazaoTerritorial(List<Pais> todosOsPaises) {
        Pais maiorPais = todosOsPaises.stream().max(Comparator.comparingDouble(Pais::getArea)).orElse(null);
        Pais menorPais = todosOsPaises.stream().min(Comparator.comparingDouble(Pais::getArea)).orElse(null);

        if (maiorPais != null && menorPais != null) {
            double razao = maiorPais.getArea() / menorPais.getArea();
            System.out.printf("\nO maior país é %s com %.2f km²\n", maiorPais.getNome(), maiorPais.getArea());
            System.out.printf("O menor país é %s com %.2f km²\n", menorPais.getNome(), menorPais.getArea());
            System.out.printf("A razão territorial do maior país em relação ao menor país é: %.2f\n", razao);
        }
    }

    public static void mostrarVizinhosComuns(List<Pais> todosOsPaises) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelecione o primeiro país:");
        for (int i = 0; i < todosOsPaises.size(); i++) {
            System.out.println((i + 1) + ". " + todosOsPaises.get(i).getNome());
        }
        System.out.print("Escolha uma opção: ");
        int escolha1 = scanner.nextInt();
        scanner.nextLine(); 
        Pais primeiroPais = todosOsPaises.get(escolha1 - 1);

        System.out.println("\nSelecione o segundo país:");
        for (int i = 0; i < todosOsPaises.size(); i++) {
            System.out.println((i + 1) + ". " + todosOsPaises.get(i).getNome());
        }
        System.out.print("Escolha uma opção: ");
        int escolha2 = scanner.nextInt();
        scanner.nextLine(); 
        Pais segundoPais = todosOsPaises.get(escolha2 - 1);

        Set<Pais> vizinhosComuns = new HashSet<>(primeiroPais.getVizinhos());
        vizinhosComuns.retainAll(segundoPais.getVizinhos());

        System.out.println("\nPaíses vizinhos comuns entre " + primeiroPais.getNome() + " e " + segundoPais.getNome() + ":");
        if (vizinhosComuns.isEmpty()) {
            System.out.println("Nenhum vizinho comum encontrado.");
        } else {
            for (Pais vizinho : vizinhosComuns) {
                System.out.println("- " + vizinho.getNome());
            }
        }
    }
}