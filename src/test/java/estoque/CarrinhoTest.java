package estoque;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.example.estoque.Carrinho;
import com.example.estoque.Produto;

public class CarrinhoTest{
    private Carrinho carrinho;

    @Before
    public void setUp() {
        carrinho = new Carrinho();
    }

    @Test
    public void testAdicionarProduto() {
        Produto racao = Produto.RACAO;
        Produto coleira = Produto.COLEIRA;

        carrinho.adicionarProduto(racao);
        carrinho.adicionarProduto(coleira);

        assertEquals(2, carrinho.produtosNoCarrinho().length);
    }

    @Test
    public void testCalcularPrecoTotal() {
        Produto racao = Produto.RACAO;
        Produto coleira = Produto.COLEIRA;

        carrinho.adicionarProduto(racao);
        carrinho.adicionarProduto(coleira);

        double precoTotal = carrinho.precoTotal();
        assertEquals(15.0, precoTotal, 0.01);
    }
}