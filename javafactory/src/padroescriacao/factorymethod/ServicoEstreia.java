package padroescriacao.factorymethod;

public class ServicoEstreia implements IServico {

    public String executar() {
        return "Estreia efetivada";
    }

    public String cancelar() {
        return "Estreia cancelada";
    }
}