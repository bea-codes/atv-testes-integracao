import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTeste {
    private Funcionario funcionario;

    @Mock
    private Cargo cargoMock; 

    @BeforeEach
    void setUp() {
         
        funcionario = new Funcionario("João", cargoMock, 1000.0);
    }

    @Test
    void testCalcularSalarioBonusParaRecepcionista() {
        
        when(cargoMock.equals(Cargo.RECEPCIONISTA)).thenReturn(true);

        double salarioCalculado = funcionario.calcularSalarioBonus();

        assertEquals(1100.0, salarioCalculado, 0.01);
    }

    @Test
    void testCalcularSalarioBonusParaAtendente() {
        // mock do cargo
        when(cargoMock.equals(Cargo.ATENDENTE)).thenReturn(true);

        // Chamar calcularSalarioBonus()
        double salarioCalculado = funcionario.calcularSalarioBonus();

        // 15% de bônus 
        assertEquals(1150.0, salarioCalculado, 0.01);
    }

    @Test
    void testCalcularSalarioBonusParaGerente() {
        //mock do cargo
        when(cargoMock.equals(Cargo.GERENTE)).thenReturn(true);

        // Chamar calcularSalarioBonus()
        double salarioCalculado = funcionario.calcularSalarioBonus();

        // 20% de bônus para gerentes
        assertEquals(1200.0, salarioCalculado, 0.01);
    }
}
