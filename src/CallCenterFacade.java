public class CallCenterFacade {
    private ServicoClienteEspecial clienteEspecial;
    private ServicoEmprestimo emprestimo;
    private ServicoPrevidencia previdencia;

    public CallCenterFacade(){
        this.clienteEspecial = new ServicoClienteEspecial();
        this.emprestimo = new ServicoEmprestimo();
        this.previdencia = new ServicoPrevidencia();
    }

    public void atenderTodosServicos(){
        System.out.println("O cliente solicitou todos os serviços:");
        clienteEspecial.atendimento();
        emprestimo.atendimento();
        previdencia.atendimento();
    }

    public void atenderClienteEspecial(){
        clienteEspecial.atendimento();
    }

    public void atenderEmprestimo(){
        emprestimo.atendimento();
    }

    public void atenderPrevidencia(){
        previdencia.atendimento();
    }

}
