public class ContaCorrente extends Conta{

    public ContaCorrente() {
        super();
    }

    @Override
    public String toString() {
        return "==Conta Corrente==\n" + super.toString();
    }

    public void extrato() {
        System.out.println("==Extrato Conta Corrente==");
        super.extrato();
    }

    public void depositar(double valor) {
        System.out.println("==Deposito Conta Corrente==");
        super.depositar(valor);
    }

    public void sacar(double valor) {
        System.out.println("==Saque Conta Corrente==");
        super.sacar(valor);
    }
}
