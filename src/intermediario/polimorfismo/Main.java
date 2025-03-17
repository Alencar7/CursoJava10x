package intermediario.polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Ninja nao da para ser criado
        uzumaki naruto = new uzumaki("Naruto Uzumaki", "Folha",17);
        naruto.habilidadeEspecialNinja();
        naruto.estrategiaDeBatalhaNinja();
        naruto.hokageAtivo(); //Interface

        //Obj itachi
        uchiha itachi = new uchiha("Itachi Uchiha", "Folha", 31);
        itachi.habilidadeEspecialNinja();
        itachi.sharinganAtivado(); //Interface

        //Obj Hatake
        hatake kakashi = new hatake();
        kakashi.nomeNinja = "Kakashi Hatake";
        kakashi.aldeiaNinja = "Folha";
        kakashi.idadeNinja = 42;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite(); //Interface

    }
}
