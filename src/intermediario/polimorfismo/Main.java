package intermediario.polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Ninja nao da para ser criado
        uzumaki naruto = new uzumaki("Naruto Uzumaki", "Folha", 17, 30, NivelNinja.GENIN);
        naruto.habilidadeEspecialNinja();
        naruto.estrategiaDeBatalhaNinja();
        naruto.hokageAtivo(); //Interface

        //Obj itachi
        uchiha itachi = new uchiha("Itachi Uchiha", "Folha", 29, 200, NivelNinja.JOUNNIN);
        itachi.habilidadeEspecialNinja();
        itachi.sharinganAtivado(); //Interface

        //Obj Hatake
        hatake kakashi = new hatake("Kakashi Hatake","Folha",42, 470, NivelNinja.JOUNNIN);
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite(); //Interface

        //obj 3
        uchiha madara = new uchiha("Madara Uchiha", "Folha",72, 1000, NivelNinja.KAGE);
        madara.estrategiaDeBatalhaNinja();
        madara.habilidadeEspecialNinja();
        //metodo padrao
        madara.inteligenciaDeCombate();
        //metodo sobrecarregado
        madara.inteligenciaDeCombate(180);

    }
}
