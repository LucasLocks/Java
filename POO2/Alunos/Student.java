package POO2.Alunos;

public class Student {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Student(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado() {
        return notaFinal() >= 60.0;
    }

    public double pontosFaltando() {
        if (aprovado()) {
            return 0.0;
        } else {
            return 60.0 - notaFinal();
        }
    }

    public String toString() {
        String resultado = "NOTA FINAL = " + String.format("%.2f", notaFinal()) + "\n";
        if (aprovado()) {
            resultado += "APROVADO";
        } else {
            resultado += "REPROVADO\nFALTARAM " + String.format("%.2f", pontosFaltando()) + " PONTOS";
        }
        return resultado;
    }
}