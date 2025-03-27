package desafios.z6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // iniciar uma linked list com 7 ninjas
        LinkedList<Ninja> cadastroList = new LinkedList<Ninja>();

        // add os ninjas => instancia da list .add(construtor())
        cadastroList.add(new Ninja("adriano", 1,"folha"));
        cadastroList.add(new Ninja("adrian", 2,"folh"));
        cadastroList.add(new Ninja("adria", 3,"fol"));
        cadastroList.add(new Ninja("adri", 4,"fo"));
        cadastroList.add(new Ninja("adr", 5,"f"));
        cadastroList.add(new Ninja("ad", 6,"fod"));
        cadastroList.add(new Ninja("a", 7,"foda"));

        // listar os ninjas
        System.out.println("Lista de ninjas: " + cadastroList);
        System.out.println("----------------------------------------------");

        // Complexidade = O(n)
        for( Ninja ninja : cadastroList) { // tipo da variavel + variavel => recebe => elementos da instancia da list
            System.out.println(ninja);
        }

        // Adicionar o ninja no inicio da lista
        cadastroList.addFirst(new Ninja("Ninja", 22,"Folha")); // .addFisrt & .addLast

        // Remover o ninja no inicio da List
        Ninja ninjaRemovido = cadastroList.removeFirst();
        System.out.println("\nO ninja removido foi o " + ninjaRemovido);

        // listar os ninjas
        for (Ninja listaAtualizada: cadastroList) {
            System.out.println("Lista atualizaa apos as mudancas" + listaAtualizada);
        }

        // procurar um ninja por indice
        Ninja indiceNinja = cadastroList.get(3);
        System.out.println("O terceiro ninja eh o " + indiceNinja);


    }
}
