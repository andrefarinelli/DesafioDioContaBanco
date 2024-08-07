public interface iConta {

    public void depositar(double valor);
    public boolean sacar(double valor);
    public boolean transferir(double valor, Conta destino);

}

