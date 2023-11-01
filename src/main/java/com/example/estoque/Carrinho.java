package com.example.estoque;
import com.example.estoque.Produto;
import java.util.ArrayList;
import java.util.List;

public class Carrinho  {
    
	private List<Produto> carrinho = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        carrinho.add(produto);
    }

    public void removerProduto(Produto produto) {
        carrinho.remove(produto);
    }

    public void produtosNoCarrinho() {
        Produto[] produtos = new Produto[carrinho.size()];
        carrinho.toArray(produtos);
        return produtos;
    }

    public void retirarTudo(){
        carrinho.clear();
    }

    public double precoTotal(){
        double precoTotal = 0.0;
        for (Produto produto : carrinho) {
            precoTotal += produto.getPreco();
        }
        return precoTotal;
    }

    public double parcelar(int nParcelas){
        double precoTotal = precoTotal();
        double precoParcela = precoTotal / nParcelas;
        return precoParcela;
    }

}
