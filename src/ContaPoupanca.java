public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numero, Cliente cliente, double rendimento) {
        super(numero, cliente);
        this.rendimento = rendimento;
    }

    public void aplicarRendimento() {
        double novoSaldo = getSaldo() * (1 + rendimento);
        setSaldo(novoSaldo);
    }

    // Getters e Setters
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
