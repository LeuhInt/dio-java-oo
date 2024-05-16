public class Main {
    public static void main(String[] args) {

        Banco cliente = new Banco();

        cliente.imprimeClientes();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        cliente.adicionaClienteCorrente("Mary", "111", 23);
        cliente.adicionaClientePoupanca("Jose", "222", 22);
        cliente.adicionaClientePoupanca("Jack", "333", 34);
        cliente.imprimeClientes();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        cliente.removerCliente("333");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        cliente.imprimeClientes();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        cliente.getClienteCpf("111").getConta().extrato();
        cliente.extratoCliente("111");
        cliente.extratoCliente("222");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        cliente.depositar("111", 500);
        cliente.depositar("222", 500);

        cliente.extratoCliente("111");
        cliente.extratoCliente("222");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        cliente.sacar("111", 200);
        cliente.sacar("222", 200);

        cliente.extratoCliente("111");
        cliente.extratoCliente("222");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        cliente.transferir("111","222",400);

        cliente.extratoCliente("111");
        cliente.extratoCliente("222");
    }
}
