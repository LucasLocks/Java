package POO2.EX1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo de Tabuleiro");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));
        
        JButton btnIniciar = new JButton("Iniciar nova partida");
        JButton btnExecutar = new JButton("Executar jogada");
        JButton btnPosicoes = new JButton("Informar posições");
        JButton btnSair = new JButton("Sair");
        
        frame.add(btnIniciar);
        frame.add(btnExecutar);
        frame.add(btnPosicoes);
        frame.add(btnSair);
        
        //Pode ser alterado número de casas totais e jogadores facilmente
        Jogo jogo = new Jogo(20 , 2);
        
        btnIniciar.addActionListener(e -> jogo.iniciarNovaPartida());
        btnExecutar.addActionListener(e -> jogo.proximaJogada());
        btnPosicoes.addActionListener(e -> {
            if (!jogo.isJogoIniciado()) {
                System.out.println(Cores.VERMELHO + "O jogo ainda não foi iniciado!" + Cores.RESET );
                return;
            }
            for (Jogador j : jogo.meusJogadores) {
                System.out.println("Jogador " + j.getNumero() + " está na casa " + j.getCasaAtual());
            }
        });
        btnSair.addActionListener(e -> System.exit(0));
        
        frame.setVisible(true);
    }
}