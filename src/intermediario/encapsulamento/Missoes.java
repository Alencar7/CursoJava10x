package intermediario.encapsulamento;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    //metodo para mostrar mais informacoes + getEnums
    public void exibirDetalhes() {
        System.out.println("Missao: " + nome + ". Rank: " + rank +
                " (Descricao: " + rank.getDescricao() + ". Dificildade: " + rank.getDificuldade() + ")");
    }

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
