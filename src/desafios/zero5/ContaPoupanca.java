package desafios.zero5;

public class ContaPoupanca extends ContaBancaria{

    private String nomeContaPoupanca;
    double valorDaContaPoupanca;

    public ContaPoupanca(String nomeContaCorrente, double valorDaContaCorrente) {
        this.nomeContaPoupanca = nomeContaCorrente;
        this.valorDaContaPoupanca = valorDaContaCorrente;
    }

    // Implements Methods 'depositar' -> com taxa de deposito!
    @Override
    public void depositar(double valor) {
        System.out.println("Deposito de "+ valor + " reais, foi realizado!");
        double taxaDeDeposito = (double) valor/100;
        System.out.println("Taxa de deposito(1%): " + taxaDeDeposito);
        valorDaContaPoupanca = valorDaContaPoupanca + (valor - taxaDeDeposito);
    }
    // Implements Methods
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo{"+ nomeContaPoupanca+ "} Valor:" + valorDaContaPoupanca + " reais.");
    }


    public String getNomeContaPoupanca() {
        return nomeContaPoupanca;
    }

    public void setNomeContaPoupanca(String nomeContaPoupanca) {
        this.nomeContaPoupanca = nomeContaPoupanca;
    }

    public double getValorDaContaPoupanca() {
        return valorDaContaPoupanca;
    }

    public void setValorDaContaPoupanca(double valorDaContaPoupanca) {
        this.valorDaContaPoupanca = valorDaContaPoupanca;
    }

}
