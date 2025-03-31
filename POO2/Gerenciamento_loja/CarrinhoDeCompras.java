import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens = new ArrayList<>();
    private Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean adicionarProduto(Produto produto, int quantidade, double desconto) {
        itens.add(new ItemCarrinho(produto, quantidade, desconto));
        return true;
    }

    public double obterValorTotal() {
        return itens.stream().mapToDouble(ItemCarrinho::obterCusto).sum();
    }

    @Override
    public String toString() {
        return "Carrinho de " + cliente.getNome() + " | Total: R$ " + obterValorTotal();
    }
}