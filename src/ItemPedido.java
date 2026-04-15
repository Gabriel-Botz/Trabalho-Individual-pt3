public class ItemPedido {

    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(String nomeProduto, double precoUnitario, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularTotal(){
        return this.getPrecoUnitario() * this.getQuantidade();
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



