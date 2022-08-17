package validadores;
import model.Pedido;


import static validadores.IsStringNulaOuVazia.isStringNulaOuVazia;

public class IValidadorNome {

    // Cria se o metodo e da o parametro da classe e objeto para a validação
    public boolean iValidador( Pedido pedido ) {

        if (isStringNulaOuVazia(pedido.getNome())) {

            System.out.println("Pedido cancelado = " + pedido);
            System.out.println("Nome não informado ");

            return false;
        }
        return true;
    }


}
