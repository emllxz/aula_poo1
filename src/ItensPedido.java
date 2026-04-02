public class ItensPedido {
    private int idItensPedido;
    protected Produtos produtos;
    protected int quantidade;
    protected double precoUnitario;

    public ItensPedido(int idItensPedido, Produtos produtos, int quantidade){
        this.idItensPedido = idItensPedido;
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.precoUnitario = produtos.getPreco();
    }
    public double subTotal(){
        return precoUnitario * quantidade;
    }
}
