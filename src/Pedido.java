import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> listaItens = new ArrayList<>();
    private double valorFrete;
    private double valorTotal;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ItemPedido item) {
        listaItens.add(item);
    }

    public void fecharPedido() {

        valorTotal = 0;

        // Soma dos itens
        for (ItemPedido item : listaItens) {
            valorTotal += item.calcularTotal();
        }

        // Regra do frete
        if (valorTotal > 250.00) {
            valorFrete = 0.0;
        } else {
            valorFrete = 25.00;
        }

        valorTotal += valorFrete;

        imprimirRecibo();
    }

    private void imprimirRecibo() {
        System.out.println("===== RECIBO =====");
        System.out.println("Cliente: " + cliente.getNome());

        System.out.println("\nItens:");
        for (ItemPedido item : listaItens) {
            System.out.println(item);
        }

        System.out.println("\nFrete: " + String.format("%.2f", valorFrete));
        System.out.println("Total Final: " + String.format("%.2f", valorTotal));
        System.out.println("==================");
    }
}