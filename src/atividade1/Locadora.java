package atividade1;
///1) Faça um programa para cadastrar dados de uma locadora de filmes, onde cada registro será composto pelos
//seguintes campos: código do filme, título do filme e gênero (A – ação, T – terror, D – drama). O programa
//deverá conter as seguintes operações:
//a) Incluir filmes no arquivo (vetor).
//b) Consultar o total de filmes de um determinado gênero.
//c) Excluir um filme do arquivo procurando pelo nome.



public class Locadora {

    private int codigoFilme;
    private String tituloFilme;
    private Character generoFilme;


    public int getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public Character getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(Character generoFilme) {
        this.generoFilme = generoFilme;
    }




}
