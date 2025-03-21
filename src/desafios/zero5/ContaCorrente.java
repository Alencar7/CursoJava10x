package desafios.zero5;

public class ContaCorrente extends ContaBancaria{

    private String nomeContaCorrente;
    double valorDaContaCorrente;

    public ContaCorrente(String nomeContaCorrente, double valorDaContaCorrente) {
        this.nomeContaCorrente = nomeContaCorrente;
        this.valorDaContaCorrente = valorDaContaCorrente;
    }

    // Implements Methods
    @Override
    public void depositar(double valor) {
        System.out.println("Deposito de "+ valor + " reais, foi realizado!");
        double taxaDeDeposito = (double) valor/100;
        System.out.println("Taxa de deposito(1%): " + taxaDeDeposito);
        valorDaContaCorrente = valorDaContaCorrente + (valor - taxaDeDeposito);

    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo{"+ nomeContaCorrente+ "} Valor: " + valorDaContaCorrente + " reais.");
    }

    public double getValorDaContaCorrente() {
        return valorDaContaCorrente;
    }

    public void setValorDaContaCorrente(double valorDaContaCorrente) {
        this.valorDaContaCorrente = valorDaContaCorrente;
    }

    public String getNomeContaCorrente() {
        return nomeContaCorrente;
    }

    public void setNomeContaCorrente(String nomeContaCorrente) {
        this.nomeContaCorrente = nomeContaCorrente;
    }


}
