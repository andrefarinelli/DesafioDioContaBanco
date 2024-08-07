public abstract class Conta implements iConta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
