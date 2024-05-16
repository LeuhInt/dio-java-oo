public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super();
    }

    @Override
    public String toString() {
        return "==ContaPoupanca==\n" + super.toString();
    }

    public void extrato(){
        System.out.println("==Extrato Conta Poupanca==");
        super.extrato();
    }

    public void depositar(double valor){
        System.out.println("==Deposito Conta Poupanca==");
        super.depositar(valor);
    }

    public void sacar(double valor){
        System.out.println("==Saque Conta Poupanca==");
        super.sacar(valor);
    }
}
