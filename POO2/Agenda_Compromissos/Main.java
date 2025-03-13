package POO2.Agenda_Compromissos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    private static Agenda agenda = new Agenda();
    private static final DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> criarInterface());
    }

    private static void criarInterface() {
        JFrame frame = new JFrame("Agenda de Compromissos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        frame.setLocationRelativeTo(null);

        JButton btnAdicionar = new JButton("Adicionar Compromisso");
        JButton btnVerificar = new JButton("Verificar Compromissos");
        JButton btnSair = new JButton("Sair");

        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarCompromisso();
            }
        });

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarCompromissos();
            }
        });

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(btnAdicionar);
        frame.add(btnVerificar);
        frame.add(btnSair);

        frame.setVisible(true);
    }

    private static void adicionarCompromisso() {
        try {
            String descricao = JOptionPane.showInputDialog("Descrição do Compromisso:");
            if (descricao == null || descricao.trim().isEmpty()) return;
    
            String dataInicioStr = JOptionPane.showInputDialog("Data de Início (dd/MM/yyyy):");
            LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatoBrasileiro);
    
            // Verifica se a data de início é hoje ou depois
            if (dataInicio.isBefore(LocalDate.now())) {
                JOptionPane.showMessageDialog(null, "A data de início deve ser a partir de hoje!");
                return;
            }
    
            String dataFimStr = JOptionPane.showInputDialog("Data de Fim (dd/MM/yyyy):");
            LocalDate dataFim = LocalDate.parse(dataFimStr, formatoBrasileiro);
    
            if (dataFim.isBefore(dataInicio)) {
                JOptionPane.showMessageDialog(null, "A data final não pode ser antes da data inicial!");
                return;
            }
    
            Compromisso compromisso = new Compromisso(dataInicio, dataFim, descricao);
            agenda.adicionarCompromisso(compromisso);
            JOptionPane.showMessageDialog(null, "Compromisso adicionado com sucesso!");
    
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido! Use dd/MM/yyyy.");
        }
    }

    private static void verificarCompromissos() {
        try {
            String diasStr = JOptionPane.showInputDialog("Quantos dias à frente deseja verificar?");
            int dias = Integer.parseInt(diasStr);

            String resultado = agenda.verificarCompromissos(dias);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    }
}