package validadores;

import model.Pedido;

import static util.FileProcessor.isStringNulaOuVazia;

public class IValidadorEmail implements IValidador {
    @Override
    public boolean iValidador( Pedido pedido) {

        if (isStringNulaOuVazia(pedido.getEmail())) {
            System.out.println("Email não informado ");
            return false;
        }

        return true;

    }
}
