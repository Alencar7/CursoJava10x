package intermediario.polimorfismo;

public abstract class ninjas implements EstrategiaDeBatalha {

    String nomeNinja;
    String aldeiaNinja;
    int idadeNinja;

    //precisa instanciar nas subclasse!
    public ninjas() {
    }
    //precisa instanciar nas subclasse!
    public ninjas(String nomeNinja, String aldeiaNinja, int idadeNinja) {
        this.nomeNinja = nomeNinja;
        this.aldeiaNinja = aldeiaNinja;
        this.idadeNinja = idadeNinja;
    }

    //Metodo Geral || Todos os ninjas vao ter
    public void habilidadeEspecialNinja() {
        System.out.println("Meu nome e " + nomeNinja + ". E este e meu ataque especial.");
    }

    // Polimorfismo(@Override) -> Sobreescrevendo o metodo da interface na classe abstrata
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome e " + nomeNinja +". Essa e minha estrategia ninja!");
    }
    // nao precisa ficar dando `imlements` nas classes(uzumaki e uchiha),
    // pois a `interface` ja esta dentro da classe `ninjas`(classe pai)

}
