package intermediario.polimorfismo;

public class uchiha extends ninjas implements SharinganInterface {

    public uchiha() {
    }

    // Metodo que vem da interface!
    public void sharinganAtivado() {
        System.out.println(nomeNinja + ": Ativou o Sharingan!");
    }

    //Construtor da SuperClasse numa subclasse precisa do 'super'
    public uchiha(String nomeNinja, String aldeiaNinja, int idadeNinja) {
        super(nomeNinja, aldeiaNinja, idadeNinja);
    }

    // sobrecarga do construtor
    public uchiha(String nomeNinja, String aldeiaNinja, int idadeNinja, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nomeNinja, aldeiaNinja, idadeNinja, numeroDeMissoesConcluidas, rank);
    }

    //sobreescerever o metodo da classe ninjas
    @Override
    public void habilidadeEspecialNinja() {
        System.out.println("Meu nome e " + nomeNinja +
                ". E esta e meu ataque Uchiha, ataque de fogo!" +
                " Eu ja completei: " + numeroDeMissoesConcluidas + " .");
    }

    @Override
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
