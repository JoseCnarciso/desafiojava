package validadores;

import model.Pedido;

public class IValidadorQuantidade {

    public boolean iValidador( Pedido pedido ) {
        // Cria se o metodo e da o parametro da classe e objeto para a validação
        if (pedido.getQuantidadeProduto() == 0) {

            System.out.println("Quantidade deve ser maior que 0." + pedido);
            return false;
        }

        return true;
    }
}
