import entidades.Cliente;

public class ContaCorrente extends ContaBanco {
    public ContaCorrente(Cliente cliente) {
        super(cliente);


    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }




}
