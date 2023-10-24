package atividade2;

//2) Faça um programa para cadastrar dados de uma empresa, onde cada registro será composto pelos seguintes
//campos: código de vendedor, nome de vendedor e tipo de mercadoria (P – perecível, N – não perecível). O
//programa deverá conter as seguintes operações:
//a) Incluir vendedores no arquivo (vetor).
//b) Consultar o total de vendedor de um determinado tipo mercadoria.
//c) Excluir um vendedor do arquivo procurando pelo nome.

public class Registros {

    private int codigo;
    private String nome;
    private Character tipo;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }


}
