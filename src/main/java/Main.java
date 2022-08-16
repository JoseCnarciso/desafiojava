import db.EstoquesDB;
import model.Estoque;
import model.Pedido;
import util.FileProcessor;
import validadores.IValidadorEmail;
import validadores.IValidadorNome;
import validadores.IValidadorProduto;
import validadores.IValidadorQuantidade;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static EstoquesDB estoqueDB = new EstoquesDB();

    public static void main( String[] args ) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Quantidade produto 1 ");
            int produto1 = scanner.nextInt();

            Estoque estoque1 = new Estoque(1, produto1);
            estoqueDB.addEstoque(estoque1);

            System.out.println("Quantidade produto 2 ");
            int produto2 = scanner.nextInt();

            Estoque estoque2 = new Estoque(2, produto2);
            estoqueDB.addEstoque(estoque2);

            System.out.println("Processando pedidos...");

            FileProcessor fileProcessor = new FileProcessor();
            List<Pedido> pedidoList = fileProcessor.lerArquivoPedidos();

            IValidadorNome validadorNome = new IValidadorNome();
            IValidadorEmail validadorEmail = new IValidadorEmail();
            IValidadorProduto validadorProduto = new IValidadorProduto();
            IValidadorQuantidade validadorQuantidade = new IValidadorQuantidade();


            for (Pedido pedido : pedidoList) {

                boolean isNomeValido = validadorNome.iValidador(pedido);
                boolean isEmailValido = validadorEmail.iValidador(pedido);
                boolean isCodigoProdutoValido = validadorProduto.iValidador(pedido);
                boolean isQuantidadeValido = validadorQuantidade.iValidador(pedido);


                if (isNomeValido && isEmailValido && isCodigoProdutoValido && isQuantidadeValido) {

                    // pegar o produto do pedido
                    int codigoProduto = Integer.parseInt(pedido.getCodigoProduto());
                    int quantidadeProdutoPedido = pedido.getQuantidadeProduto();

                    // ler o estoque e pegar a quantidade atual daquele produto
                    int quantidadeProdutoAtual = estoqueDB.quantidadeProduto(codigoProduto);

                    // validar se a quantidade do estoque é suficiente para confirmar o pedido
                    if (quantidadeProdutoPedido > quantidadeProdutoAtual) {
//
                        System.out.println("Codigo Produto: " + pedido.getCodigoProduto());
                        System.out.println("Quantidade atual insuficiente.");
                        System.out.println("Quantidade atual: " + quantidadeProdutoAtual + " - quantidade pedido: " + quantidadeProdutoPedido);
                    } else {
                        // se sim, confirma o pedido e baixar a quantidade
                        estoqueDB.baixarEstoque(codigoProduto, quantidadeProdutoPedido);
                        System.out.println("Pedido confirmado = " + pedido);

                        estoqueDB.getEstoques().forEach(System.out::println);
                    }
                }

                System.out.println("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
