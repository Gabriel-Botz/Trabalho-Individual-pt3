public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gabriel", "123.456.789-00");

        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(new ItemPedido("Mouse", 50.00, 1));
        pedido.adicionarItem(new ItemPedido("Teclado", 150.00, 1));

        pedido.fecharPedido();
    }
}