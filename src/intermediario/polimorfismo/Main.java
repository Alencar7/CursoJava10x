package intermediario.polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Ninja nao da para ser criado
        uzumaki naruto = new uzumaki("Naruto Uzumaki", "Folha", 17, 30, NivelNinja.GENIN, Biju.KURAMA);
        naruto.habilidadeEspecialNinja();
        naruto.estrategiaDeBatalhaNinja();
        naruto.hokageAtivo(); //Interface
        System.out.println(naruto); //toString
        naruto.tacarKunai();
        System.out.println(naruto.biju);
        naruto.nextLine();

        //Obj Final Class Anbu
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja de Elite Secreto";
        System.out.println(ninjaAnbu.nome);
        ninjaAnbu.anbu();
        System.out.println("-----------------------------------------");

        //Obj itachi
        uchiha itachi = new uchiha("Itachi Uchiha", "Folha", 29, 200, NivelNinja.JOUNNIN);
        itachi.habilidadeEspecialNinja();
        itachi.sharinganAtivado(); //Interface
        itachi.nextLine(); // final method

        //Obj Hatake
        hatake kakashi = new hatake("Kakashi Hatake","Folha",42, 470, NivelNinja.JOUNNIN);
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite(); //Interface
        kakashi.nextLine(); // final method

        //obj 3
        uchiha madara = new uchiha("Madara Uchiha", "Folha",72, 1000, NivelNinja.KAGE);
        madara.estrategiaDeBatalhaNinja();
        madara.habilidadeEspecialNinja();
        //metodo PADRAO -> inteligenciaDeCombate
        madara.inteligenciaDeCombate();
        //metodo SOBRECARREGADO -> inteligenciaDeCombate
        madara.inteligenciaDeCombate(180);
        madara.nextLine(); // final method



    }
}
