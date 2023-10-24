package atividade4;
//Faça um programa que controle o estoque de uma loja de brinquedos. Atualmente existem 40 itens, cada um
///contendo o código, descrição, preço de compra, preço de venda, quantidade em estoque e estoque mínimo.
///a) Crie uma rotina para cadastrar os produtos;
///b) Crie uma rotina para mostrar o valor do lucro obtido com a venda de um determinado produto (faz a
//pesquisa pelo campo código);
//c) Crie uma rotina que mostre todos os produtos com quantidade em estoque abaixo do estoque mínimo
//permitido.
public class Produtos {

    private int codigo;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int qntEstoque;
    private int estoqueMin;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
}
