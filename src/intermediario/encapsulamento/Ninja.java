package intermediario.encapsulamento;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoes;
    private double altura = 2.10;

    public Ninja() {

    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoes = numeroDeMissoes;
        this.altura = altura;
    }

    //Mostrar/Tirar dados => GET + Nome da variavel
    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public double getAltura() {
        return altura;
    }

    //Receber/Add dados => SET + Nome da variavel
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
