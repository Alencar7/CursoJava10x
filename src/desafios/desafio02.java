package desafios;

import java.util.Scanner;

public class desafio02 {

    /*
    Desafio: Gerenciar o cadastro de usuarios numa vila.
    Crie um sistema simples em java para cadastrar novos usuarios
    e listar todos os usuarios cadastrados.

    -Arrays: Para armazenar os nomes dos usuarios
    -Switch Cases: Para implementar um menu iterativo
    -Loops: Para navegar pelas opcoes do menu e iterar sobre usuarios criados
    -Condicionais: Para controlar a exec das opcoes do menu
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMaximo = 100;
        String[] usuarios = new String[numeroMaximo];
        int usuariosCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("Sistema de cadastro.\n" +
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

                        System.out.println("Cadastro realizado!");
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
