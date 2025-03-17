package desafios.zero1;

public class desafio01 {

    public static void main(String[] args) {

        //ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 15;
        String missaoNinja1 = "Encontrar o bandido";
        String statusDaMissao1 = "Em andamento";
        char nivelDaMissao1 = 'D';

        // VERIFICAR O NIVEL DA MISSAO
        if (idadeNinja1 < 16) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D'){
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Nao concluida, por causa da idade.";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("---------------------------------");
        System.out.println("Nomde do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Status da missao: " + statusDaMissao1);
        System.out.println("Nivel da missao: " + nivelDaMissao1);

        //ninja 2
        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 13;
        String missaoNinja2 = "Encontrar o Naruto";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'B';

        System.out.println("---------------------------------");
        System.out.println("Nomde do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Status da missao: " + statusDaMissao2);
        System.out.println("Nivel da missao: " + nivelDaMissao2);

        //ninja 3
        String nomeNinja3 = "Sakura";
        int idadeNinja3 = 13;
        String missaoNinja3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'C';

        System.out.println("---------------------------------");
        System.out.println("Nomde do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missao: " + missaoNinja3);
        System.out.println("Status da missao: " + statusDaMissao3);
        System.out.println("Nivel da missao: " + nivelDaMissao3);
    }
}
