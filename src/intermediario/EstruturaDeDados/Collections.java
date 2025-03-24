package intermediario.EstruturaDeDados;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        String[] array = new String[3]; // o array por padrao NAO tem a implementacao toString()
        //Classes
        //Collections - Classes que implementam a interface
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList);


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
            |<<<<<<<> SET <>
            |       |               |->HashSet
            |       |--------------{
            |       |               |>LinkedHashSet
            |       |-> SortedSet
            |               |
            |               |-> TreeSet
            |
            <>
         */
    }
}
