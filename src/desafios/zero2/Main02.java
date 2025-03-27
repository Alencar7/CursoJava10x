package desafios.zero2;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMaximo = 100;
        String[] usuarios = new String[numeroMaximo];
        int usuariosCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("Sistema de Ninja.\n" +
                    "As opçoes sao: \n" +
                    "1- Adicionar o nome \n" +
                    "2- Mostrar a lista de nomes \n" +
                    "3- para sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: //add usuario
                    if (usuariosCadastrados < numeroMaximo){
                        System.out.println("Digite seu nome: ");
                        String nomeUsuario = scanner.nextLine();

                        usuarios[usuariosCadastrados] = nomeUsuario;
                        usuariosCadastrados++;

                        System.out.println("Ninja realizado!");
                    } else {
                        System.out.println("A lista esta cheia.");
                    }
                    break;

                case 2: //mostrar lista de usuarios
                    if (usuariosCadastrados == 0){
                        System.out.println("Nenhum usuario cadastrado.");
                    } else {
                        System.out.println();
                        for (int i = 0; i < usuarios.length ; i++) {
                            if (usuarios[i] == null) {
                                break;
                            }else {
                                System.out.println(usuarios[i]);
                            }
                        }
                    }
                    break;

                case 3: // encerrar
                    System.out.println("Encerrando.");
                    break;
                default:
                    System.out.println("Comando invalido!");

            }
        }
        scanner.close();
    }

}