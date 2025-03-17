package intermediario.polimorfismo;

public class uchiha extends ninjas implements SharinganInterface {

    // Metodo que vem da interface!
    public void sharinganAtivado() {
        System.out.println(nomeNinja + ": Ativou o Sharingan!");
    }


    //Construtor da SuperClasse numa subclasse precisa do 'super'
    public uchiha(String nomeNinja, String aldeiaNinja, int idadeNinja) {
        super(nomeNinja, aldeiaNinja, idadeNinja);
    }

    //sobreescerever o metodo da classe ninjas
    @Override
    public void habilidadeEspecialNinja() {
        System.out.println("Meu nome e " + nomeNinja +
                ". E esta e meu ataque Uchiha, ataque de fogo!");
    }
}
