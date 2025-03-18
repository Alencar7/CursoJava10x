package intermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------Obj 1--------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 16, 19,1.67);
        System.out.println("Meu nome e " + naruto.getNome()); //caixa publica = getNome
        naruto.setNome("Naruto Uzumaki, com nome alterado ;D");
        System.out.println("Meu nome e " + naruto.getNome());

        System.out.println("--------------Obj 2--------------");
        Uchiha sasuke = new Uchiha("Sasuke", "Folha", 17, 19,1.74);

        //Enuns
        Missoes missao1 = new Missoes("Resgatar Cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar o Zabuza",RankDeMissoes.A);
        missao2.exibirDetalhes();


    }
}
