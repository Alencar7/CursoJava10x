package desafios.zero3;

import java.util.Scanner;

public class main03 {

    public static void main(String[] args) {

        uchiha03 sasuke03 = new uchiha03();
        sasuke03.nome03 = "Sasuke";
        sasuke03.idade03 = 16;
        sasuke03.missao03 = "Matar todos";
        sasuke03.nivelDificuldade = "A+";
        sasuke03.statusMissao = "Em desenvolvimento";

        sasuke03.mostrarInformacoes();
        sasuke03.mostrarHabilidadeEspecial();

    }
}

/*
            -----------------------------DESAFIO PLUS-----------------------------

Scanner scanner = new Scanner(System.in);

        int numeroDaLista = 10;
        String[] listaNinjas = new String[numeroDaLista];
        int opcao = 0;

        while (opcao != 4) {

            System.out.println("Sistema de Cadasto da vila.");
            System.out.println("As opçoes sao: \n" +
                    "1- Cadastrar ninja \n" +
                    "2- Mostrar a lista de nomes dos ninjas \n" +
                    "3- Atualizar as habilidades especiais \n" +
                    "4- para sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: // add
                    break;
                case 2: // mostrar lista
                    break;
                case 3: // atualizar as habilidades especiais
                    break;
                case 4: // sair
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Comando invalido!");
            }
        }


        scanner.close();

 */