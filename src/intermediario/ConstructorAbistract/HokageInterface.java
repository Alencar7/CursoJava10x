package intermediario.ConstructorAbistract;

public interface HokageInterface {

    // Tudo(atributo/variavel) eh automaticamente FINAL
    String nome = "Naruto Uzumaki";
    String aldeia = "Folha";
    int idade = 17;

    // Ele OBRIGATORIAMENTE Abstrato
    void tacarUmaShuriken();
}
