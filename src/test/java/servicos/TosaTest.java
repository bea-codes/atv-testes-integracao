package servicos;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.example.cliente.Porte;
import com.example.servicos.TipoDeTosa;
import com.example.servicos.Tosa;

public class TosaTest {
	// private Tosa tosa;

	@Test
	public void testCalcularPrecoDaTosa(){

		// TipoDeTosa tipoDeTosaMock = mock(TipoDeTosa.class);
		// Porte porteDoAnimalMock = mock(Porte.class);
		Tosa tosa = mock(Tosa.class);

		when(tosa.getPorteDoAnimal()).thenReturn(Porte.GRANDE);
		when(tosa.getTipoDeTosa()).thenReturn(TipoDeTosa.NA_MAQUINA);

		when(tosa.calcularPreco(TipoDeTosa.NA_MAQUINA, Porte.GRANDE)).thenCallRealMethod();

		double precoCalculado = tosa.calcularPreco(TipoDeTosa.NA_MAQUINA, Porte.GRANDE);

		assertEquals(65, precoCalculado, 0.05);
	}
}
