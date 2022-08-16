package db;

import model.Estoque;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EstoquesDB {
    //
    private List<Estoque> estoques = new ArrayList<>();

    public List<Estoque> getEstoques() {
        return estoques;
    }


    public void addEstoque( Estoque estoque ) throws IOException {
        estoques.add(estoque);

    }

    public int quantidadeProduto( int codigoProduto ) throws Exception {

        if (codigoProduto <= 0) {
            throw new Exception("Codigo do produto invalido");
        }

        if (estoques.isEmpty()) {
            throw new Exception("Estoque vazio");
        }

        for (Estoque e : estoques) {

            if (e.getProdutoCodigo() == codigoProduto) {
                return e.getQtd();
            }
        }
        throw new Exception("Produto " + codigoProduto + " nao encontrado.");
    }

    public void baixarEstoque( int codigoProduto, int quantidadeProdutoPedido ) {
        for (Estoque e : estoques) {
            if (e.getProdutoCodigo() == codigoProduto) {
                e.setQtd(e.getQtd() - quantidadeProdutoPedido);
            }
        }
    }
}
