public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private Conta conta;

    public Cliente(String nome, String cpf, int idade, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
                "nome: " + nome + '\'' +
                ", cpf: " + cpf + '\'' +
                ", idade: " + idade + "\n" +
                 conta;
    }
}
