package validadores;

import model.Pedido;

import static validadores.IsStringNulaOuVazia.isStringNulaOuVazia;


public class IValidadorProduto {
    // Cria se o metodo e da o parametro da classe e objeto para a validação
    public boolean iValidador( Pedido pedido ) {

        if (isStringNulaOuVazia(pedido.getCodigoProduto())) {
            System.out.println("Pedido cancelado " + pedido );
            System.out.println("Produto não informado ");
            return false;
        }

        if ((!pedido.getCodigoProduto().equals("1")) && (!pedido.getCodigoProduto().equals("2"))) {
            System.out.println("Codigo do Produto invalido " + pedido);
            return false;
        }

        return true;

    }
}
