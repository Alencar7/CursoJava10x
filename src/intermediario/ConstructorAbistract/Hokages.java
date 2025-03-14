package intermediario.ConstructorAbistract;

public abstract class Hokages {

    // alt + insert |ou| crtl + n : comando para auto-fazer o Construtor()
    // ( pode ser vazio, conter alguns ou ALL)

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    float altura;

    //Metodo abstract nao pode ter corpo, apenas a "casca"
    public abstract void sabedoriaHokage();

    public abstract void nomeDoHokage();

    //Metodo nao abstrato
    public void tacarKunai(){
        System.out.println("Eu taquei uma Kunai");
    }

}

    /*

    ***** Topico sobre construtores *****

    //No Args Constructor
    public Hokages(){
        //construtor vazio, sem argumentos
    }

    //criar um construtor com argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    //AllArgs Constructor || Crtl + N
    public Hokages(String nome, int idade,
                   boolean vivoOuNao, String aldeia,
                   int missoes, double saldoBancario, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

     */

