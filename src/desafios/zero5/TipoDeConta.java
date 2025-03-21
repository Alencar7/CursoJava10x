package desafios.zero5;

public enum TipoDeConta {

    CORRENTE("C", "Conta Corrente"),
    POUPANCA("P", "Conta Poupanca");

    private String descricao;
    private String tipoDeConta;

    TipoDeConta(String descricao, String tipoDeConta) {
        this.descricao = descricao;
        this.tipoDeConta = tipoDeConta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
}
