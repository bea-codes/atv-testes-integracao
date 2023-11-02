import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ClienteServiceTest {

    @Test
    public void testGetNome() {
        Cliente cliente = new Cliente("Feurinha", "Cachorro", 5, "Rua A, 123", true);
        assertEquals("Feurinha", cliente.getNome());
    }

    @Test
    public void testSetEndereco() {
        Cliente cliente = new Cliente("Feurinha", "Cachorro", 5, "Rua A, 123", true);
        cliente.setEndereco("Rua B, 456");
        assertEquals("Rua B, 456", cliente.getEndereco());
    }

    @Test
    public void testAgendarConsulta() {
        Cliente cliente = new Cliente("Feurinha", "Cachorro", 5, "Rua A, 123", true);
        cliente.agendarConsulta("2023-11-05");
        // Aqui você pode adicionar asserções relevantes para verificar se a consulta foi agendada corretamente
    }

    @Test
    public void testRealizarCompra() {
        Cliente cliente = new Cliente("Feurinha", "Cachorro", 5, "Rua A, 123", true);
        cliente.realizarCompra("Ração");
        // Aqui você pode adicionar asserções relevantes para verificar se a compra foi realizada corretamente
    }

    @Test
    public void testIsPrimeiraVisita() {
        Cliente cliente1 = new Cliente("Feurinha", "Cachorro", 5, "Rua A, 123", true);
        assertTrue(cliente1.isPrimeiraVisita());

        Cliente cliente2 = new Cliente("Mimi", "Gato", 3, "Rua C, 789", false);
        assertFalse(cliente2.isPrimeiraVisita());
    }
}