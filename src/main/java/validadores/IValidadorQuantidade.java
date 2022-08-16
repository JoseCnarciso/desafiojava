package validadores;

import model.Pedido;

public class IValidadorQuantidade implements IValidador {

    @Override
    public boolean iValidador( Pedido pedido ) {

        if (pedido.getQuantidadeProduto() == 0) {
            System.out.println("Quantidade deve ser maior que 0.");
            return false;
        }

        // validacoes do banco




        return true;
    }
}
