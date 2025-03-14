package intermediario.polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Ninja nao da para ser criado
        uzumaki naruto = new uzumaki();
        naruto.nomeNinja = "Naruto";
        naruto.habilidadeEspecialNinja();
        naruto.estrategiaDeBatalhaNinja();

        uchiha sasuke = new uchiha();
        sasuke.nomeNinja = "Sasuke";
        sasuke.habilidadeEspecialNinja();
        sasuke.estrategiaDeBatalhaNinja();

    }
}
