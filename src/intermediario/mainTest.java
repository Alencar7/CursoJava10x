package intermediario;

public class mainTest {
    public static void main(String[] args) {

        //criacao do: Ninja Sasuke -> `sasuke` e um objeto
        // Classe(ou heranca) + Objeto = new Classe();
        //obj 1
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Folha";
        Sasuke.idade = 16;
        Sasuke.SharinganAtivado();

        //Obj 2
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.aldeia = "Folha";
        Naruto.idade = 15;
        Naruto.ModoSabio();

        //Obj 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.aldeia = "Folha";
        Sakura.idade = 14;
        Sakura.AtivarCura();

        //Obj 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.aldeia = "Folha";
        Hinata.idade = 14;
        Hinata.ByakuganAtivado();

        //Aplicando Metodos ao Obj
        String chamandoMetodo = Sasuke.euSouUmNinja(); //str = String()
        System.out.println(chamandoMetodo);

        // variavel = Obj + .Metodo da Classe ( Parametro )
        int quantoTempoFalta = Sasuke.anosParaTornarHokage(30); //
        System.out.println("Voce tem " + Sasuke.idade + "anos, entao falta no minimo " + quantoTempoFalta + " anos para se formar.");

        System.out.println("_____________________________");

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Folha 2.0";
        Boruto.idade = 3;

        Boruto.ModoSabio();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

    }
}
