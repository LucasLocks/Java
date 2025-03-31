import javax.swing.*;
import java.math.BigInteger;

public class Main {
    private static Loja loja = new Loja();

    public static void main(String[] args) {
        boolean continuar = true;
        
        while (continuar) {
            String opcao = JOptionPane.showInputDialog(null, 
                "1 - Cadastrar cliente\n" +
                "2 - Cadastrar produto\n" +
                "3 - Iniciar venda\n" +
                "4 - Adicionar produto ao carrinho\n" +
                "5 - Exibir conteúdo do carrinho\n" +
                "6 - Fechar venda\n" +
                "0 - Sair", 
                "Entrada", JOptionPane.QUESTION_MESSAGE);
            
            if (opcao == null) break; // Usuário clicou em "Cancelar"
            
            switch (opcao) {
                case "1": // Cadastrar Cliente
                    String nome = JOptionPane.showInputDialog("Nome do cliente:");
                    String cpfStr = JOptionPane.showInputDialog("CPF do cliente:");
                    loja.cadastrarCliente(new Cliente(nome, new BigInteger(cpfStr)));
                    break;

                case "2": // Cadastrar Produto
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do produto:"));
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto:"));
                    loja.cadastrarProduto(new Produto(codigo, valor));
                    break;

                case "3": // Iniciar Venda
                    String nomeCliente = JOptionPane.showInputDialog("Nome do cliente:");
                    if (loja.iniciarVenda(nomeCliente)) {
                        JOptionPane.showMessageDialog(null, "Venda iniciada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;

                case "4": // Adicionar Produto ao Carrinho
                    int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Código do produto:"));
                    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
                    double desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto (%):"));
                    if (loja.adicionarProduto(codigoProduto, quantidade, desconto)) {
                        JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao adicionar produto!");
                    }
                    break;

                case "5": // Exibir Carrinho
                    JOptionPane.showMessageDialog(null, loja.vendaEmAndamento != null ? loja.vendaEmAndamento.toString() : "Carrinho vazio!");
                    break;

                case "6": // Fechar Venda
                    double total = loja.fecharVenda();
                    JOptionPane.showMessageDialog(null, "Venda finalizada! Total: R$ " + total);
                    break;

                case "0": // Sair
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}