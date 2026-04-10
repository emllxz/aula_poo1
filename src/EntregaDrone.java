public class EntregaDrone {
    public EntregaDrone(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void realizarEntrega(){
        System.out.print("Entrega realizada por Moto");
    }
}
