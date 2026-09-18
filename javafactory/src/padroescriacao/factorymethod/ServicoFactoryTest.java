package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServicoFactoryTest {

    @Test
    public void deveRetornarServicoEstreia() {

        IServico servico = ServicoFactory.obterServico("Estreia");

        assertEquals("Estreia efetivada", servico.executar());
        assertEquals("Estreia cancelada", servico.cancelar());
    }

    @Test
    public void deveRetornarServicoIngresso() {

        IServico servico = ServicoFactory.obterServico("Ingresso");

        assertEquals("Ingresso efetivado", servico.executar());
        assertEquals("Ingresso cancelado", servico.cancelar());
    }

    @Test
    public void deveRetornarServicoCancelamento() {

        IServico servico = ServicoFactory.obterServico("Cancelamento");

        assertEquals("Cancelamento efetivado", servico.executar());
        assertEquals("Cancelamento cancelado", servico.cancelar());
    }

    @Test
    public void deveRetornarErroParaServicoInexistente() {

        assertThrows(IllegalArgumentException.class, () -> {
            ServicoFactory.obterServico("Inexistente");
        });
    }

    @Test
    public void deveRetornarErroParaServicoInvalido() {

        assertThrows(IllegalArgumentException.class, () -> {
            ServicoFactory.obterServico("Aluguel");
        });
    }
}