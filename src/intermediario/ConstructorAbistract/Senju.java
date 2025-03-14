package intermediario.ConstructorAbistract;

public class Senju extends Hokages {

    @Override
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
