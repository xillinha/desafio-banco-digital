public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("BANCO DA PRISCILLA");

        for (int i = 1; i <= 10; i++) {
            Cliente cliente = new Cliente();
            cliente.setNome("Cliente"+i);

            banco.getClientes().add(cliente);
        }

        banco.listarClientes();


        Conta cc = new ContaCorrente(banco.getClientes().getFirst());
        Conta poupanca = new ContaPoupanca(banco.getClientes().getFirst());

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
