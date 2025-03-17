package desafios.zero4;

public class NinjaBásico implements Ninja {

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;


    public NinjaBásico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBásico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this(nome, idade, habilidade);
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome e: " + nome + "!");
        System.out.println("Idade: " + idade);
        System.out.println("Meu tipo de habilidade e: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() { //fazer o ninja usar sua habilidade.
        System.out.println("Executando a minha habilidade de ninja basico: " + habilidade);
    }
}
