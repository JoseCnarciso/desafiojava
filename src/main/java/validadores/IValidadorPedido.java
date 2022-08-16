package validadores;

import model.Pedido;

public class IValidadorPedido implements IValidador {

    @Override
    public boolean iValidador( Pedido pedido ) {

        return false;
    }
}
