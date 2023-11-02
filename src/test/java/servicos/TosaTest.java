package servicos;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.mockito.Mock;

import com.example.cliente.Porte;
import com.example.servicos.TipoDeTosa;
import com.example.servicos.Tosa;

public class TosaTest {
	private Tosa tosa;

	@Mock
	private TipoDeTosa tipoDeTosaMock;

	@Mock
	private Porte porteDoAnimalMock;

	@Before
	void setUp(){
		tosa = new Tosa(tipoDeTosaMock, porteDoAnimalMock);
	}

	@Test
	void testCalcularPrecoDaTosa(){
		when(tipoDeTosaMock.equals(TipoDeTosa.NA_MAQUINA)).thenReturn(true);

		when(porteDoAnimalMock.equals(Porte.MEDIO)).thenReturn(true);

		double precoCalculado = tosa.calcularPreco();

		assertEquals(60, precoCalculado, 0.05);
	}
}
