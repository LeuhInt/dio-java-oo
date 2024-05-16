public abstract class Conta {

    private static final int AGENCIA = 1;
    private static int NUM_CONTA = 1;

    private int agencia;
    private int numConta;
    private double saldo;

    public Conta() {
        this.agencia = AGENCIA;
        this.numConta = NUM_CONTA++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "agencia: " + agencia +
                ", numConta: " + numConta +
                "\n";
    }

    public void extrato() {
        System.out.println(
                "Seu saldo é de: " + getSaldo() + "\n"
                        + toString());
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito no valor de:  " + valor + " realizado com sucesso!\n");
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque no valor de: " + valor + " realizado com sucesso!\n");
        }
    }

    public void tranferir(double valor) {
        sacar(valor);
    }
}
