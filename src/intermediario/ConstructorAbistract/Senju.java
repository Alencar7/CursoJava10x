package intermediario.ConstructorAbistract;

public class Senju extends Hokages {

    public void sabedoriaHokage() {
        System.out.println("Voce ganhou sabedoria!");
    }

    @Override
    public void nomeDoHokage() {
        System.out.println("Meu nome e " + nome);
    }

    public Senju() {
    }
}
