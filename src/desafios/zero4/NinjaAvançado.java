package desafios.zero4;

public class NinjaAvançado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvançado(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaAvançado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this(nome, idade, habilidade);
        this.tipoHabilidade = tipoHabilidade;
    }

    public void especialidade() {
        System.out.println("Especialidade de um Ninja Avancado!");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome e: " + nome + "!");
        System.out.println("Idade: " + idade);
        System.out.println("Meu tipo de habilidade e: " + tipoHabilidade);

    }

    @Override
    public void executarHabilidade() { //fazer o ninja usar sua habilidade.
        System.out.println("Executando a minha habilidade: " + habilidade);
    }
}
