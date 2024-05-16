import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void adicionaClienteCorrente(String nome, String cpf, int idade) {
        clientes.add(new Cliente(nome, cpf, idade, new ContaCorrente()));
    }

    public void adicionaClientePoupanca(String nome, String cpf, int idade) {
        clientes.add(new Cliente(nome, cpf, idade, new ContaPoupanca()));
    }

    public void removerCliente(String cpf) {
        boolean clienteRemovido = clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
        if (clienteRemovido) {
            System.out.println("Cliente cpf: " + cpf + " removido");
        } else {
            System.out.println("Cliente cpf: " + cpf + "não encontrado");
        }

    }

    public void imprimeClientes() {
        if (!clientes.isEmpty()) {
            clientes.forEach(System.out::println);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public Cliente getClienteCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public void extratoCliente(String cpf) {
        if (getClienteCpf(cpf) != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpf)) {
                    cliente.getConta().extrato();
                }
            }
        } else {
            System.out.println("Cliente cpf: " + cpf + " não encontrado");
        }
    }

    public void depositar(String cpf, int valor) {
        if (getClienteCpf(cpf) == null) {
            System.out.println("Cliente cpf: " + cpf + " não encontrado");
        } else {
            Cliente cliente = getClienteCpf(cpf);
            cliente.getConta().depositar(valor);
        }
    }

    public void sacar(String cpf, int valor) {
        if (getClienteCpf(cpf) == null) {
            System.out.println("Cliente cpf: " + cpf + " não encontrado");
        } else {
            Cliente cliente = getClienteCpf(cpf);
            cliente.getConta().sacar(valor);
        }
    }

    public void transferir(String cpf1, String cpf2, double valor) {
        if (getClienteCpf(cpf1) == null || getClienteCpf(cpf2) == null) {
            System.out.println("Cliente cpf não encontrado");
        } else {
            Cliente cliente1 = getClienteCpf(cpf1);
            Cliente cliente2 = getClienteCpf(cpf2);
            cliente1.getConta().tranferir(valor);
            cliente2.getConta().tranferir(valor);
        }
    }

    @Override
    public String toString() {
        return "Banco:" +
                "clientes:\n " + clientes + "\n";
    }
}
