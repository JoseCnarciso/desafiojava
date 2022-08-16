package validadores;

import model.Pedido;

import static util.FileProcessor.isStringNulaOuVazia;

public class IValidadorEmail {

    public boolean iValidador( Pedido pedido ) {

        if (isStringNulaOuVazia(pedido.getEmail())) {
            System.out.println("Pedido cancelado ");
            System.out.println("Email não informado ");
            return false;
        }

        return true;

    }
}
