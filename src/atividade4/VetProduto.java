package atividade4;

public class VetProduto {
    Produtos[]prodVet = new Produtos[40];
    int indexProd = 0;
    double lucro = 0;

    public void Incluir(int codigo, String descricao, double precoCompra, double precoVenda, int estoque){
        Produtos inserir = new Produtos();

        if (indexProd<40) {
            inserir.setCodigo(codigo);
            inserir.setDescricao(descricao);
            inserir.setPrecoCompra(precoCompra);
            inserir.setPrecoVenda(precoVenda);
            inserir.setQntEstoque(estoque);

            prodVet[indexProd] = inserir;
            indexProd++;
            System.out.println("\nProduto cadastrado com sucesso! ");
        }else {
            System.out.println("Limite de produtos atingido! ");
        }

    }

    public void Lucro(int codigoP){

        boolean checarLucro = true;

        for (int i = 0; i<indexProd; i++){

            Produtos lucrativos = prodVet[i];

            if (lucrativos.getCodigo()==codigoP){
                double compra = lucrativos.getPrecoCompra();
                double venda = lucrativos.getPrecoVenda();

                lucro = venda - compra;
                System.out.printf("\nO produto de código: %d. \nDescrito como: %s. \nTeve um lucro de: %.2fR$.\n", lucrativos.getCodigo(), lucrativos.getDescricao() ,lucro );

                checarLucro = false;
            }
        }
        if (checarLucro){
            System.out.println("Produto não encontrado! ");
        }
    }


    public void ChecarEstoque(int estoqueMin){
        boolean prodAbaixo = true;
        for (int i = 0; i<indexProd; i++){
            Produtos estoque = prodVet[i];

            if (estoque.getQntEstoque()<estoqueMin){
                System.out.println("\nProduto de código: "+estoque.getCodigo()+ "\nDescrito como: "+estoque.getDescricao() +"\nEstá abaixo do estoque mínimo.");
                prodAbaixo = false;
            }
        }
        if (prodAbaixo) {
            System.out.println("Nenhum produto abaixo do limite de estoque permitido! ");
        }
    }
}
