package intermediario.polimorfismo;

public class uzumaki extends ninjas implements HokageInterface{

    public uzumaki() {
    }

    public uzumaki(String nomeNinja, String aldeiaNinja, int idadeNinja) {
        super(nomeNinja, aldeiaNinja, idadeNinja);
    }

    // sobrecarga do construtor
    public uzumaki(String nomeNinja, String aldeiaNinja, int idadeNinja, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nomeNinja, aldeiaNinja, idadeNinja, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecialNinja() {
        System.out.println("Meu nome e " + nomeNinja +
                ". E esta e meu ataque Uzumaki, um ataque de ar!");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nomeNinja + ": eu sou um Hokage!");
    }



}

