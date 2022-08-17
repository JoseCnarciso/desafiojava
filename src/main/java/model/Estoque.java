package model;

public class Estoque {

    private int produtoCodigo;
    private int qtd;

    public Estoque( int produtoCodigo, int qtd ) {
        this.produtoCodigo = produtoCodigo;
        this.qtd = qtd;
    }

    public int getProdutoCodigo() {
        return produtoCodigo;
    }

    public void setProdutoCodigo( int produtoCodigo ) {
        this.produtoCodigo = produtoCodigo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd( int qtd ) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "produtoCodigo=" + produtoCodigo + ", qtd=" + qtd;
    }
}
