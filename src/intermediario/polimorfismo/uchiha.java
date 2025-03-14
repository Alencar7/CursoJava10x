package intermediario.polimorfismo;

public class uchiha extends ninjas {

    //sobreescerever o metodo da classe ninjas
    @Override
    public void habilidadeEspecialNinja() {
        System.out.println("Meu nome e " + nomeNinja +
                ". E esta e meu ataque Uchiha, ataque de fogo!");
    }
}
