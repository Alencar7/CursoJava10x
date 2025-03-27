package desafios.zero6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // criando a lista
        List<ListaDeCadastro> listaDeCadastros = new ArrayList<>();

        //Obj instanciado
        listaDeCadastros.add(new ListaDeCadastro("Naruto",10,"Folha"));
        listaDeCadastros.add(new ListaDeCadastro("Sasuke",12,"Folha"));
        listaDeCadastros.add(new ListaDeCadastro("Gaara",13,"Folha"));
        listaDeCadastros.add(new ListaDeCadastro("Hinata",14,"Folha"));
        listaDeCadastros.add(new ListaDeCadastro("Sakura",15,"Folha"));
        listaDeCadastros.add(new ListaDeCadastro("Neji",16,"Folha"));
        listaDeCadastros.add(new ListaDeCadastro("Rock Lee",17,"Folha"));

        LinkedList<ListaDeCadastro> linkedListCadastro = new LinkedList<>(listaDeCadastros);

        System.out.println("Entrar no sistema de Ninja!" +
                "\nDigite '1' para entrar ou '0' para sair.");
        int opcao = scanner.nextInt();

        while ( opcao != 0) {
            System.out.println("Manual:" +
                    "\n1. Adicionar Novo Ninja." +
                    "\n2. Remover o primeiro Ninja" +
                    "\n3. Listar Ninjas cadastrados" +
                    "\n4. Acessar Ninja numa posicao especifica" +
                    "\n0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: //add
                    System.out.println("Adicionar novo ninja:");
                    System.out.println("Nome: ");
                    String variavelNome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int variavelIdade = scanner.nextInt();
                    System.out.println("Vila: ");
                    String variavelVila = scanner.nextLine();
                    //add list no linkedlist
                    linkedListCadastro.add(new ListaDeCadastro(variavelNome, variavelIdade, variavelVila));
                    break;

                case 2: //remover
                    //remover o primeiro ninja
                    linkedListCadastro.removeFirst(); // removeFirst
                    System.out.println("Ninja removido!");
                    break;

                case 3: // Listar ninjas
                    //exibir os dados campletos => get/set
                    for (ListaDeCadastro pp : linkedListCadastro) {
                        System.out.println("Nome= "+ pp.getNome()+
                                ". Idade= " + pp.getIdade()+
                                ". Vila= " + pp.getVila());
                    }
                    //exibir os dados campletos => toString
                    //for (ListaDeCadastro p : linkedListCadastro) {
                        //System.out.println(p);
                    //}
                    break;

                case 4: //acessar na posicao
                    System.out.println("Posicao especifica: ");
                    int i = scanner.nextInt();
                    if (i != 0 && i < linkedListCadastro.size()) {
                        System.out.println("Ninja na posicao: " + i +
                                ", eh o " + linkedListCadastro.element().getNome());
                    } else {
                        System.out.println("Nao tem essa posicao");
                    }
                    break;

                case 0: //sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Comando invalido!");
            }
        }

        scanner.close();
    }
}
