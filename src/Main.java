public class Main {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco("Rua A", 123, "Cidade B", "Estado C");
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", endereco);

        ContaCorrente contaCorrente = new ContaCorrente(1, cliente, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, cliente, 0.01);

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(2000.0);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(300.0);
        contaPoupanca.aplicarRendimento();

        System.out.println("Saldo Conta Corrente após saque: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após rendimento: " + contaPoupanca.getSaldo());

        contaCorrente.transferir(200.0, contaPoupanca);

        System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após receber transferência: " + contaPoupanca.getSaldo());
    }
}
