package Projeto3;

public class Combate {
    private Campeao campeao1;
    private Campeao campeao2;
    private int turnos;

    public Combate(Campeao campeao1, Campeao campeao2, int turnos) {
        if (turnos < 1 || turnos > 20) throw new IllegalArgumentException("O número de turnos deve ser entre 1 e 20 !");
        this.campeao1 = campeao1;
        this.campeao2 = campeao2;
        this.turnos = turnos;
    }

    public void iniciar() {
        for (int i = 1; i <= turnos; i++) {
            System.out.println("Resultado do turno " + i + ":");

            // Campeão 1 ataca primeiro
            campeao2.receberDano(campeao1.getAtaque());

            // Verifica se o campeão 2 morreu após o ataque do campeão 1
            if (!campeao2.estaVivo()) {
                System.out.println(campeao1.status());
                System.out.println(campeao2.status());
                System.out.println(campeao2.getNome() + " morreu, o grande campeão foi " + campeao1.getNome() + " !");
                break;
            }

            // Campeão 2 ataca se ainda estiver vivo
            campeao1.receberDano(campeao2.getAtaque());

            // Verifica se o campeão 1 morreu após o ataque do campeão 2
            if (!campeao1.estaVivo()) {
                System.out.println(campeao1.status());
                System.out.println(campeao2.status());
                System.out.println(campeao1.getNome() + " morreu, o grande campeão foi " + campeao2.getNome() + " !");
                break;
            }

            // Exibe status dos campeões caso ambos ainda estejam vivos
            System.out.println(campeao1.status());
            System.out.println(campeao2.status());
        }
        System.out.println("\n\t\t### FIM DO COMBATE ! ###");
    }
}