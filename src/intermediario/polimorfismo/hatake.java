package intermediario.polimorfismo;

public class hatake extends ninjas implements SharinganInterface, AmbuInterface, HokageInterface{
    // o kakahi tem caracteristicas do uchiha, ninjas, hatake = HERANCA MULTIPLA
    public void boasVindas(){
        System.out.println(nomeNinja + "Eu sou um Hatake");
    }

    public hatake() {
    }

    public hatake(String nomeNinja, String aldeiaNinja, int idadeNinja) {
        super(nomeNinja, aldeiaNinja, idadeNinja);
    }

    // sobrecarga do construtor
    public hatake(String nomeNinja, String aldeiaNinja, int idadeNinja, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nomeNinja, aldeiaNinja, idadeNinja, numeroDeMissoesConcluidas, rank);
    }

    // Metodo que vem da interface!
    public void sharinganAtivado() {
        System.out.println(nomeNinja + ": Ativou o Sharingan!");
    }
    // Metodo que vem da interface!
    public void ninjaDeElite(){
        System.out.println(nomeNinja + ": Eu sou da Ambu!");
    }
    // Metodo que vem da interface!
    public void hokageAtivo() {
        System.out.println(nomeNinja + ": eu sou um Hokage!");
    }
}
