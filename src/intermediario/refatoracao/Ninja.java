package intermediario.refatoracao;

//objeto
public class Ninja {

    String nome;
    String aldeia;
    int idade;

    //Criar metodo publico personalizado
    public String euSouUmNinja(){
        // retorna uma string
        return "oi, eu sou um ninja"; //nao aparece no terminal
    }

    public int anosParaTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }


}
