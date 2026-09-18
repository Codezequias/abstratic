package padroescriacao.factorymethod;

public class ServicoCancelamento implements IServico {

    public String executar() {
        return "Cancelamento efetivado";
    }

    public String cancelar() {
        return "Cancelamento cancelado";
    }
}