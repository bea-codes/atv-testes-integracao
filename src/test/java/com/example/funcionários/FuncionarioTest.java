package com.example.funcionários;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class FuncionarioTest {

    public void testCalcularSalarioBonusParaRecepcionista() {
        Funcionario funcionarioMock = mock(Funcionario.class);
        when(funcionarioMock.getSalario()).thenReturn(1000.0);
        when(funcionarioMock.calcularSalarioBonus(Cargo.RECEPCIONISTA)).thenCallRealMethod(); 

        double salarioComBonus = funcionarioMock.calcularSalarioBonus(Cargo.RECEPCIONISTA);

        assertEquals(1100.0, salarioComBonus, 0.01);
    }

    @Test
    public void testCalcularSalarioBonusParaGerente() {
        Funcionario funcionarioMock = mock(Funcionario.class);
        when(funcionarioMock.getSalario()).thenReturn(1000.0);
        when(funcionarioMock.calcularSalarioBonus(Cargo.GERENTE)).thenCallRealMethod(); 
        double salarioComBonus = funcionarioMock.calcularSalarioBonus(Cargo.GERENTE);
        assertEquals(1200.0, salarioComBonus, 0.01);
    }

    @Test
    public void testCalcularSalarioBonusParaAtendente() {
        Funcionario funcionarioMock = mock(Funcionario.class);
        when(funcionarioMock.getSalario()).thenReturn(1000.0);
        when(funcionarioMock.calcularSalarioBonus(Cargo.ATENDENTE)).thenCallRealMethod(); 
        double salarioComBonus = funcionarioMock.calcularSalarioBonus(Cargo.ATENDENTE);

        assertEquals(1150.0, salarioComBonus, 0.01);
    }

}
