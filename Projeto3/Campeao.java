package Projeto3;

public class Campeao {
    private String nome;
    private int vida;
    private int ataque;
    private int armadura;

    public Campeao(String nome, int vida, int ataque, int armadura) {
        if (vida <= 0) throw new IllegalArgumentException("A vida deve ser maior que zero !");
        if (ataque < 1) throw new IllegalArgumentException("O ataque deve ser maior que zero !");
        if (armadura < 0) throw new IllegalArgumentException("A armadura não pode ser negativa !");

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public void receberDano(int dano) {
        // Ajuste de dano com armadura
        int danoAposArmadura = dano - this.armadura;

        if (danoAposArmadura <= 0) {
            // A armadura absorve todo o dano, mas ainda perde-se 1 de vida
            this.armadura -= dano;
            this.vida -= 1;
        } else {
            // Dano maior que a armadura
            this.vida -= danoAposArmadura;
            this.armadura = 0;
        }

        // Garante que a vida não seja negativa
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public String status() {
        if (vida == 0) {
            return nome + ": 0 de vida (morreu)";
        } else {
            return nome + ": " + vida + " de vida, " + armadura + " de armadura";
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    // Método getter para ataque
    public int getAtaque() {
        return ataque;
    }

    // Método getter para nome
    public String getNome() {
        return nome;
    }
}