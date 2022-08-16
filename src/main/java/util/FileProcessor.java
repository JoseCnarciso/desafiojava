package util;

import model.Estoque;
import model.Pedido;
import validadores.IValidadorEmail;
import validadores.IValidadorNome;
import validadores.IValidadorProduto;
import validadores.IValidadorQuantidade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class FileProcessor {

    // criada costante para acesso dos arquivos
    private final String ARQUIVO_PEDIDO = "E:\\Mentorama\\DesafioJava\\pedidos.txt";


    public List<Pedido> lerArquivoPedidos() {

        List<Pedido> listaPedidos = new ArrayList<>();

        try {
            // Linha de endereço do arquivo a ser lido
            Path filePath = Paths.get(ARQUIVO_PEDIDO);
            // Lista de Strings... Será lido linha a linha
            List<String> lines = Files.readAllLines(filePath);
            // forEach para leitura das linhas
            for (int i = 1; i < lines.size(); i++) {
                String[] pedido = lines.get(i).split(",");
                //Informa a quantidade de colunas do arquivo
                if (pedido.length == 4) {

                    Pedido ped = new Pedido();
                    ped.setNome(pedido[0].trim());
                    ped.setEmail(pedido[1].trim());
                    ped.setCodigoProduto(pedido[2].trim());
                    ped.setQuantidadeProduto(Integer.parseInt(pedido[3].trim()));

                    listaPedidos.add(ped);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro de leitura " + e);
        }

        return listaPedidos;
    }
}
