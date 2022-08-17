package validadores;

import model.Pedido;

import static validadores.IsStringNulaOuVazia.isStringNulaOuVazia;


public class IValidadorEmail {

    public boolean iValidador( Pedido pedido ) {

        // Cria se o metodo e da o parametro da classe e objeto para a validação
        if (isStringNulaOuVazia(pedido.getEmail())) {
            System.out.println("Pedido cancelado = " + pedido);
            System.out.println("Email não informado ");
            return false;
        }

        return true;

    }
}
