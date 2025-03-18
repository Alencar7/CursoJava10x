package intermediario.polimorfismo;

public class uzumaki extends ninjas implements HokageInterface{

    Biju biju; //Enum das Bijus

    public uzumaki() {
    }

    // sobrecarga do construtor
    public uzumaki(String nomeNinja, String aldeiaNinja, int idadeNinja, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nomeNinja, aldeiaNinja, idadeNinja, numeroDeMissoesConcluidas, rank);
    }

    public uzumaki(String nomeNinja, String aldeiaNinja, int idadeNinja, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nomeNinja, aldeiaNinja, idadeNinja, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
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

