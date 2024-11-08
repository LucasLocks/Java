public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;

    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 10;
        this.forca = 10;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void morrer() {
        this.vivo = false;
        this.forca = 0;
        System.out.println("O animal morreu!");
    }

    public void comer() {
        if (vivo && caloria < 100) {
            caloria = Math.min(100, caloria + 10);
            forca = Math.max(0, forca - 2);
            System.out.println("O animal comeu e agora sua força é " + forca + " e suas calorias valem " + caloria + ".");
        } else if (!vivo) {
            System.out.println("O animal está morto e não pode comer.");
        } else {
            System.out.println("O animal está cheio e não precisa comer.");
        }
    }

    public void correr() {
        if (vivo && caloria > 0) {
            forca = Math.max(0, forca - 5);
            caloria = Math.max(0, caloria - 5);
            System.out.println("O animal está correndo! Agora sua força é de " + forca + " e suas calorias valem " + caloria + ".");
        } else if (!vivo) {
            System.out.println("O animal está morto e não pode correr.");
        } else {
            System.out.println("O animal está exausto e não pode correr.");
        }
    }

    public void dormir() {
        if (vivo) {
            forca = Math.min(100, forca + 10);
            caloria = Math.max(0, caloria - 2);
            System.out.println("O animal está dormindo agora! Sua força aumentou para " + forca + " e suas calorias diminuíram para " + caloria + ".");
        } else {
            System.out.println("O animal está morto e não pode dormir.");
        }
    }

    public void exibirEstado() {
        System.out.println("O animal se chama " + nome + ", é da classe " + classe + " da família " + familia + ". O animal possui força " + forca + ", caloria de " + caloria + " e " + idade + " de idade.");
    }
}
