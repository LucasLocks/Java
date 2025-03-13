package POO2.EX1;

import java.util.ArrayList;
import java.util.List;

class Jogo {
    private Tabuleiro meuTabuleiro;
    List<Jogador> meusJogadores;
    private Dado meuDado;
    private boolean jogoIniciado = false;
    private boolean jogoEncerrado = false;
    private int indiceJogadorAtual = 0;
    
    public Jogo(int numeroCasas, int numeroJogadores) {
        meuTabuleiro = new Tabuleiro(numeroCasas);
        meusJogadores = new ArrayList<>();
        meuDado = new Dado();
        
        for (int i = 1; i <= numeroJogadores; i++) {
            meusJogadores.add(new Jogador(i));
        }
    }
    
    public void iniciarNovaPartida() {
        jogoIniciado = true;
        jogoEncerrado = false;
        indiceJogadorAtual = 0;
        for (Jogador jogador : meusJogadores) {
            jogador.resetar();
        }
        limparConsole();
        System.out.println(Cores.VERDE + "Nova partida iniciada!" + Cores.RESET);
    }
    
    public void proximaJogada() {
        if (!jogoIniciado) {
            System.out.println(Cores.VERMELHO + "O jogo ainda não foi iniciado!" + Cores.RESET);
            return;
        }
        if (jogoEncerrado) {
            System.out.println(Cores.VERMELHO + "O jogo já foi encerrado! Não é possível executar novas jogadas!" + Cores.RESET);
            return;
        }
        
        Jogador jogador = meusJogadores.get(indiceJogadorAtual);
        int numeroSorteado = meuDado.rolar();
        int novaPosicao = jogador.getCasaAtual() + numeroSorteado;
        
        if (novaPosicao >= meuTabuleiro.getNumeroCasas()) {
            jogador.jogar(meuTabuleiro.getNumeroCasas() - jogador.getCasaAtual());
            System.out.println("Jogador " + jogador.getNumero() + " rolou " + numeroSorteado + " e chegou na casa "+ meuTabuleiro.getNumeroCasas());
            System.out.println(Cores.VERDE + "Jogador " + jogador.getNumero() + " venceu!" + Cores.RESET);
            jogoEncerrado = true;
        } else {
            jogador.jogar(numeroSorteado);
            System.out.println("Jogador " + jogador.getNumero() + " rolou " + numeroSorteado);
        }
        
        indiceJogadorAtual = (indiceJogadorAtual + 1) % meusJogadores.size();
    }
    
    public boolean isJogoIniciado() {
        return jogoIniciado;
    }
    
    private void limparConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }
    }
}
