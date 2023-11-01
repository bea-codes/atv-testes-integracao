import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import com.example.cliente.Porte;
import com.example.servicos.Banho;
import com.example.servicos.TipoDeBanho;
import com.example.servicos.TipoDeTosa;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class BanhoTeste {
	private Banho banho;

	@Mock
	private TipoDeBanho tipoDeBanhoMock;

	@Mock
	private Porte porteMock;

	@BeforeEach
	void setUp(){
		banho = new Banho(tipoDeBanhoMock, porteMock);
	}

	@Test
	void testCalcularPrecoDoBanho(){
		when(porteMock.equals(Porte.GRANDE)).thenReturn(true);
		when(tipoDeBanhoMock.equals(TipoDeBanho.PELOS_BRANCOS)).thenReturn(true);
		double precoCalculado = banho.calcularPreco();
		assertEquals(65.0, precoCalculado, 0.05);
	}
}
