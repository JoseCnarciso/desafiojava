package validadores;

import model.Pedido;

import static util.FileProcessor.isStringNulaOuVazia;

public class IValidadorProduto implements IValidador {
    @Override
    public boolean iValidador( Pedido pedido ) {

        if (isStringNulaOuVazia(pedido.getCodigoProduto())) {
            System.out.println("Produto não informado ");
            return false;
        }

        if ((!pedido.getCodigoProduto().equals("1")) && (!pedido.getCodigoProduto().equals("2")) ) {
            System.out.println("Codigo do Produto invalido ");
            return false;
        }

        return true;

    }
}
