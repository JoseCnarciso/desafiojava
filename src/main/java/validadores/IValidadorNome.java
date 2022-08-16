package validadores;


import model.Pedido;
import util.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static validadores.IsStringNulaOuVazia.isStringNulaOuVazia;


public class IValidadorNome {

    public boolean iValidador( Pedido pedido ) {

        if (isStringNulaOuVazia(pedido.getNome())) {
            System.out.println("Pedido cancelado ");
            System.out.println("Nome não informado ");
            return false;
        }
        return true;
    }


}
