import entidades.Cliente;

public class main {
    public static void main(String[] args) {

        

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        ContaBanco cc = new ContaCorrente(venilton);
        ContaBanco cp = new ContaPoupanca(venilton);



        cc.depositar(100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();







    }
}
