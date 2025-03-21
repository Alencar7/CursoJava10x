package desafios.zero5;

public class BancoKonoha {
    public static void main(String[] args) {

        ContaCorrente guy = new ContaCorrente("Guy", 500.00);

        System.out.println("___________");
        guy.consultarSaldo();
        System.out.println("___________");
        guy.depositar(200);
        guy.consultarSaldo();

        ContaPoupanca sai = new ContaPoupanca("Sai", 200.00);
        System.out.println("___________");
        sai.consultarSaldo();
        System.out.println("___________");
        sai.depositar(100);
        sai.consultarSaldo();
    }
}
