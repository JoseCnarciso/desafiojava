package model;

public class Pedido {
    private String nome;
    private String email;
    private String codigoProduto;
    private int quantidadeProduto;

    public Pedido() {
        this.nome = nome;
        this.email = email;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto( String codigoProduto ) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto( int quantidadeProduto ) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "model.Pedido{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", codigoProduto='" + codigoProduto + '\'' +
                ", quantidadeProduto=" + quantidadeProduto +
                '}';
    }
}
