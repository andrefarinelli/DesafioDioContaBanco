public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, Cliente cliente, double limiteChequeEspecial) {
        super(numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() + limiteChequeEspecial >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    // Getters e Setters
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
