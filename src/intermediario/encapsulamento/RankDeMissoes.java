package intermediario.encapsulamento;

//toda vez que eu quiser padronizar o codigo e evitar trabalho repetitivo!

public enum RankDeMissoes {

    D("Baixo",2),
    C("Moderado",3),
    B("Confortavel",4),
    A("Dificil", 5),
    S("Altissimo",12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
