public class ItemPedido {

    private final String nomeProduto;
    private final double precoUnitario;
    private final int quantidade;

    public ItemPedido(String nomeProduto, double precoUnitario, int quantidade) {

        if (nomeProduto == null || nomeProduto.isBlank()) {
            throw new IllegalArgumentException("Nome do produto inválido");
        }
        if (precoUnitario < 0 || quantidade < 0) {
            throw new IllegalArgumentException("Valores inválidos");
        }

        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return this.precoUnitario * this.quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +
                " | Qtd: " + quantidade +
                " | Unit: " + precoUnitario +
                " | Total: " + calcularTotal();
    }
}


