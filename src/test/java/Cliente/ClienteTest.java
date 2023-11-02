import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.cliente.Cliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ClienteTest {

    @Mock
    private Cliente clienteMock;

    @Test
    public void testGetNome() {
        when(clienteMock.getNome()).thenReturn("Feiurinha");
        assertEquals("Feiurinha", clienteMock.getNome());
    }

    @Test
    public void testSetEndereco() {
        when(clienteMock.getEndereco()).thenReturn("Rua B, 456");
        clienteMock.setEndereco("Rua B, 456");
        verify(clienteMock, times(1)).setEndereco("Rua B, 456");
    }

    @Test
    public void testAgendarConsulta() {
        Cliente cliente = mock(Cliente.class);
        cliente.agendarConsulta("2023-11-05");
        verify(cliente, times(1)).agendarConsulta("2023-11-05");
    }

    @Test
    public void testRealizarCompra() {
        Cliente cliente = mock(Cliente.class);
        cliente.realizarCompra("Ração");
        verify(cliente, times(1)).realizarCompra("Ração");
    }

    @Test
    public void testIsPrimeiraVisita() {
        when(clienteMock.isPrimeiraVisita()).thenReturn(true);
        assertTrue(clienteMock.isPrimeiraVisita());

        when(clienteMock.isPrimeiraVisita()).thenReturn(false);
        assertFalse(clienteMock.isPrimeiraVisita());
    }
}