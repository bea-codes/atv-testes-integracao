package estoque;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.estoque.Carrinho;
import com.example.estoque.Produto;


public class CarrinhoTest {
    private Carrinho carrinho;
    private Produto racaoMock;
    private Produto coleiraMock;

    @Before
    public void setUp() {
        carrinho = new Carrinho();
        racaoMock = mock(Produto.class);
        coleiraMock = mock(Produto.class);

        when(racaoMock.getNome()).thenReturn("Racao");
        when(racaoMock.getPreco()).thenReturn(10.0);

        when(coleiraMock.getNome()).thenReturn("Coleira");
        when(coleiraMock.getPreco()).thenReturn(5.0);
    }

    @Test
    public void testAdicionarProduto() {
        carrinho.adicionarProduto(racaoMock);
        carrinho.adicionarProduto(coleiraMock);

        Produto[] produtosNoCarrinho = carrinho.produtosNoCarrinho();
        assertEquals(2, produtosNoCarrinho.length);

        verify(racaoMock, times(1)).getNome();
        verify(racaoMock, times(1)).getPreco(); 
        verify(coleiraMock, times(1)).getNome(); 
        verify(coleiraMock, times(1)).getPreco(); 
    }

    @Test
    public void testRetirarProduto() {
        carrinho.adicionarProduto(racaoMock);
        carrinho.adicionarProduto(coleiraMock);
        carrinho.removerProduto(coleiraMock);

        Produto[] produtosNoCarrinho = carrinho.produtosNoCarrinho();
        assertEquals(1, produtosNoCarrinho.length);

        verify(racaoMock, times(1)).getNome(); 
        verify(racaoMock, times(1)).getPreco(); 
    }

    @Test
    public void testRetirandoTodosProdutos() {
        carrinho.adicionarProduto(racaoMock);
        carrinho.adicionarProduto(coleiraMock);
        carrinho.retirarTudo();

        Produto[] produtosNoCarrinho = carrinho.produtosNoCarrinho();
        assertEquals(0, produtosNoCarrinho.length);

    }
    
    @Test
    public void testCalcularPrecoTotal() {
        carrinho.adicionarProduto(racaoMock);
        carrinho.adicionarProduto(coleiraMock);

        double precoTotal = carrinho.precoTotal();
        assertEquals(15.0, precoTotal, 0.01);

        verify(racaoMock, times(1)).getNome(); 
        verify(racaoMock, times(1)).getPreco(); 
        verify(coleiraMock, times(1)).getNome(); 
        verify(coleiraMock, times(1)).getPreco(); 
    }

    @Test
    public void testCalcularParcelas() {
        carrinho.adicionarProduto(racaoMock);
        carrinho.adicionarProduto(coleiraMock);

        double valorParcela = carrinho.parcelar(3);
        assertEquals(5.0, valorParcela, 0.01);

        verify(racaoMock, times(1)).getNome(); 
        verify(racaoMock, times(1)).getPreco(); 
        verify(coleiraMock, times(1)).getNome(); 
        verify(coleiraMock, times(1)).getPreco(); 
    }
}