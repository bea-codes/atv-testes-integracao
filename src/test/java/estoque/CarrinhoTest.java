package estoque;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import com.example.estoque.Carrinho;
import com.example.estoque.Produto;


public class CarrinhoTest {

    @Mock
    private Produto produtoMock1;

    @Mock
    private Produto produtoMock2;

    private Carrinho carrinho;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        carrinho = new Carrinho();
    }

    @Test
    public void testAdicionarProduto() {
        Produto racao = Produto.RACAO;
        Produto coleira = Produto.COLEIRA;
        carrinho.adicionarProduto(racao);
        carrinho.adicionarProduto(coleira);

        Produto[] produtosNoCarrinho = carrinho.produtosNoCarrinho();
        assertEquals(2, produtosNoCarrinho.length);


    }

    @Test
    public void testRetirarProduto() {
        Produto racao = Produto.RACAO;
        Produto coleira = Produto.COLEIRA;
        carrinho.adicionarProduto(racao);
        carrinho.adicionarProduto(coleira);
        carrinho.removerProduto(coleira);

        Produto[] produtosNoCarrinho = carrinho.produtosNoCarrinho();
        assertEquals(1, produtosNoCarrinho.length);
    }

    @Test
    public void testRetirandoTodosProdutos() {
        Produto racao = Produto.RACAO;
        Produto coleira = Produto.COLEIRA;
        carrinho.adicionarProduto(racao);
        carrinho.adicionarProduto(coleira);
        carrinho.retirarTudo();

        Produto[] produtosNoCarrinho = carrinho.produtosNoCarrinho();
        assertEquals(0, produtosNoCarrinho.length);

    }
    
    @Test
     public void testCalcularPrecoTotal() {
        // Configura os comportamentos dos mocks
        when(produtoMock1.getPreco()).thenReturn(10.0);
        when(produtoMock2.getPreco()).thenReturn(5.0);

        carrinho.adicionarProduto(produtoMock1);
        carrinho.adicionarProduto(produtoMock2);

        double precoTotal = carrinho.precoTotal();
        assertEquals(15.0, precoTotal, 0.01);

        // Verifica se os métodos dos mocks foram chamados
        Mockito.verify(produtoMock1, times(1)).getPreco();
        Mockito.verify(produtoMock2, times(1)).getPreco();
    }

    @Test
    public void testCalcularParcelas() {
        Produto racao = Produto.RACAO;
        Produto coleira = Produto.COLEIRA;
        carrinho.adicionarProduto(racao);
        carrinho.adicionarProduto(coleira);

        double valorParcela = carrinho.parcelar(3);
        assertEquals(5.0, valorParcela, 0.01);
    }
}