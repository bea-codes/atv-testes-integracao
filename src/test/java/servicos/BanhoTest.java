package servicos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.example.cliente.Porte;
import com.example.servicos.Banho;
import com.example.servicos.TipoDeBanho;
import static org.junit.Assert.assertEquals;


public class BanhoTest {

	@Test
	public void testCalcularPrecoDoBanho(){
		// Porte porteMock = mock(Porte.class);
		// TipoDeBanho tipoDeBanhoMock = mock(TipoDeBanho.class);
		Banho banhoMock = mock(Banho.class);

		when(banhoMock.getPorteDoAnimal()).thenReturn(Porte.MEDIO);
		when(banhoMock.getTipoDeBanho()).thenReturn(TipoDeBanho.PELOS_BRANCOS);
		
		when(banhoMock.calcularPreco(TipoDeBanho.PELOS_BRANCOS, Porte.MEDIO)).thenCallRealMethod();

		double precoCalculado = banhoMock.calcularPreco(TipoDeBanho.PELOS_BRANCOS, Porte.MEDIO);
		assertEquals(60.0, precoCalculado, 0.05);
	}
}
