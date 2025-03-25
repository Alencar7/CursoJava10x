package intermediario.EstruturaDeDados;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /*
        { Arvore da Collection e tudo o que ela engloba!}
            <> COLLECTION <>
            |
            |<<<<<<<> LIST <>
            |       |-> ArrayList
            |               l> otimo para buscas, porem pessimo para grande volume de dados(tirar ou colcoar dados e pessimo)
            |       |-> LinkedList
            |               l> lista encadeada->ponteiros, otimo para desempenho, porem pessimo para buscas
            |       |-> Stack
            |               l> espacos da memoria em formato de pilha \ /, Last In, First Out
            |
            |<<<<<<<> QUEUE <>
            |       |-> PriorityQueue
            |
            |<<<<<<<> SET <> (ignorar itens duplicados)
            |       |               |->HashSet
            |       |--------------{        l> Ordem de dados aleatoria
            |       |               |>LinkedHashSet
            |       |-> SortedSet           l> Ordem de dados sequencial
            |               |
            |               |-> TreeSet
            |                       l> Ordem de dados por ordenacao
            <>
         */

        String[] array = new String[3]; // o array por padrao NAO tem a implementacao toString()
        //Classes
        //Collections - Classes que implementam a interface
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("kakashi");
        ninjasList.add("Danzo");

        //Queue
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        //linkedlist
        linkedList.add("Naruto do LinkedList");
        System.out.println(linkedList);

        //Set
        Set<String> ninjaSet = new HashSet<>(); //ignorar itens duplicados!
        ninjaSet.add("Naruto do Set");
        ninjaSet.add("Sasuke do Set");
        ninjaSet.add("Naruto do Set");
        System.out.println("ninjasSet =" + ninjaSet);
        ninjaSet.addAll(linkedList); // add uma linkedlist dentro do Set
        System.out.println("ninjasSet =" + ninjaSet);
        ninjaSet.remove("Naruto do Set"); // remove
        System.out.println("ninjasSet =" + ninjaSet);

        //TreeSet
        Set<String> ninjasTreeSet = new TreeSet<>();
        ninjasTreeSet.addAll(ninjasList);
        System.out.println("ninjasTreeSet = " + ninjasTreeSet);

        //LinkedHashSet
        LinkedHashSet<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjasList);
        System.out.println("ninjasLinkedHashSet = " + ninjasLinkedHashSet);

    }
}
