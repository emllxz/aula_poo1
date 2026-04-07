import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private int idRestaurante;
    public String nomeRestaurante;
    protected String enderecoRestaurante;

    private List<Produtos> cardapio = new ArrayList<>();

    public Restaurante(String nomeRestaurante, String enderecoRestaurante) {
        this.idRestaurante = idRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
    }
    public void adicionarProduto (Produtos produtos){
        cardapio.add(produtos);
    }
    public List<Produtos> getCardapio(){
        return cardapio;
    }
}
