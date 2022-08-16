package validadores;


import model.Pedido;
import util.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static util.FileProcessor.isStringNulaOuVazia;

public class IValidadorNome implements IValidador {

    @Override
    public boolean iValidador( Pedido pedido) {
//        FileProcessor filePath = new FileProcessor();
//        List<String> lines = Files.readAllLines((Path) filePath);
//
//        for(int i = 1; i < lines.size(); i++) {
//            // Vetor de pedido, onde as linhas lidas são divididas pela (",") VÍRGULA
//            String[] pedido = lines.get(i).split(",");
//            if (pedido[0].isEmpty())
//                System.out.println("Nome não informado ");
//        }

        if (isStringNulaOuVazia(pedido.getNome())) {
            System.out.println("Nome não informado ");
            return false;
        }
        return true;
    }


}
