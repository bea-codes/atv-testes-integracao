import org.junit.Test;
import com.example.atendimento.Atendimento;
import com.example.atendimento.AtendimentoService;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class AtendimentoServiceTest {

    @Test
    public void testAdicionarAtendimento() {
        AtendimentoService atendimentoService = new AtendimentoService();
        Atendimento atendimento = new Atendimento(new Date(), "Consulta");
        atendimentoService.adicionarAtendimento(atendimento);
        assertEquals(1, atendimentoService.getListaAtendimentos().size());
    }

    @Test
    public void testAtualizarAtendimento() {
        AtendimentoService atendimentoService = new AtendimentoService();
        Atendimento atendimentoAntigo = new Atendimento(new Date(), "Consulta");
        atendimentoService.adicionarAtendimento(atendimentoAntigo);

        Atendimento atendimentoNovo = new Atendimento(new Date(), "Exame");
        atendimentoService.atualizarAtendimento(atendimentoAntigo, atendimentoNovo);

        assertEquals(1, atendimentoService.getListaAtendimentos().size());
        assertEquals("Exame", atendimentoService.getListaAtendimentos().get(0).getTipoAtendimento());
    }

    @Test
    public void testRemoverAtendimento() {
        AtendimentoService atendimentoService = new AtendimentoService();
        Atendimento atendimento = new Atendimento(new Date(), "Consulta");
        atendimentoService.adicionarAtendimento(atendimento);

        atendimentoService.removerAtendimento(atendimento);

        assertEquals(0, atendimentoService.getListaAtendimentos().size());
    }

}
