package padroescriacao.factorymethod;

public class ServicoIngresso implements IServico {

    public String executar() {
        return "Ingresso efetivado";
    }

    public String cancelar() {
        return "Ingresso cancelado";
    }
}