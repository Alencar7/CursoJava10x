package desafios.zero4;

public class Main04 {
    public static void main(String[] args) {

        NinjaBásico naruto = new NinjaBásico("Naruto Uzumaki", 17, "Hasengan", TipoHabilidade.GENJUTSU);
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvançado guy = new NinjaAvançado("Might Guy ", 39,"Oito Portões Internos", TipoHabilidade.TAIJUTSU);
        guy.mostrarInformacoes();
        guy.executarHabilidade();
        guy.especialidade();
    }
}
