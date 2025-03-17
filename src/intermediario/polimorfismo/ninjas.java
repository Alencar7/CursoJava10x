package intermediario.polimorfismo;

public abstract class ninjas implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Genin, Chuunin, Junnin, Kage
    String nomeNinja;
    String aldeiaNinja;
    int idadeNinja;
    int numeroDeMissoesConcluidas;
    NivelNinja rank; //Enum


    //o costrutor precisa instanciar nas subclasse!
    public ninjas() {
    }
    //precisa instanciar nas subclasse!
    public ninjas(String nomeNinja, String aldeiaNinja, int idadeNinja) {
        this.nomeNinja = nomeNinja;
        this.aldeiaNinja = aldeiaNinja;
        this.idadeNinja = idadeNinja;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor e sim os novos atributos
    public ninjas(String nomeNinja, String aldeiaNinja, int idadeNinja, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nomeNinja, aldeiaNinja, idadeNinja); //referrencia o construtor anterior
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //Metodo Geral || Todos os ninjas vao ter
    public void habilidadeEspecialNinja() {
        System.out.println("Meu nome e " + nomeNinja + ". E este e meu ataque especial.");
    }

    // Polimorfismo(@Override) -> Sobreescrevendo o metodo da interface na classe abstrata
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome e " + nomeNinja +". Essa e minha estrategia ninja!"); // nao precisa ficar dando `imlements` nas classes(uzumaki e uchiha)
    }                                                                                           // pois a `interface` ja esta dentro da classe `ninjas`(classe pai)

    //Sobrecarga de metodo - Inteligencia de Combate - METODO PADRAO
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome e: " + nomeNinja + ". Essa e minha inteligencia de combate.");
    }

    //Sobrecarga de metodo - Inteligencia de Combate - SOBRECARGA DE METODO
    public void inteligenciaDeCombate(int qi) {

        if(qi > 150) {
            System.out.println("Seu QI e: " + qi + ". Voce e um genio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI e: \" + qi + \". Voce e um ninja promissor!");
        } else {
            System.out.println("Seu QI e: \" + qi + \". Voce precisa treinar mais suas estrategias!");
        }
    }

}
