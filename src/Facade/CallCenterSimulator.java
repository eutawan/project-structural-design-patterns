package Facade;

public class CallCenterSimulator {
    public static void main(String[] args) {

        CallCenterFacade callCenterFacade = new CallCenterFacade();

        callCenterFacade.atenderTodosServicos();
        callCenterFacade.atenderClienteEspecial();
        callCenterFacade.atenderEmprestimo();
        callCenterFacade.atenderPrevidencia();

    }
}