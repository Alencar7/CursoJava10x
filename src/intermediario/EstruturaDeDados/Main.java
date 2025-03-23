package intermediario.EstruturaDeDados;

import java.util.*;

public class Main {
    /*
    ---------------------<> RESUMAO DE ESTRUTURA DE DADOS <>----------------------
    - Arrays
    - ArraysList / List
    - Stack
     */
    public static void main(String[] args) {

        //arrays - estaticos(tamanho pre-definido) e tratamendo da ref da memoria
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto";
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[0]); // valor do endereco da memoria
        System.out.println("nomeNinjaArray = " + nomeNinjaArray); // referencia da memoria

        for (int i = 0; i < nomeNinjaArray.length ; i++) {
            System.out.println("Nome[" + i + "]= " + nomeNinjaArray[i]);
        }

        //lista - um pouco mais lenta(dinamica(sem tamanho definido)) em comparacao ao Array(por causa da memoria)
        // List<T> listaGenerica = new ArrayList<T>();
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String aa = scanner.next();
        nomeNinjaList.add(aa);

        System.out.println("ArrayList: " + nomeNinjaList);

        //Stacks - Uma lista que depende de uma ordem. Last In, First Out
        // Stack<T> tipoGenerico = new Stack<T>();
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto U");
        nomeNinjaStack.push("Sasuke");
        nomeNinjaStack.add(".add");
        nomeNinjaStack.push("Sakura");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar a pilha/Stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar nova Stack = " + nomeNinjaStack);

        // Queue // Filas -> sistema de hierarquia: pedidos da mc , sistema de agendamento de dentista
        //nao da para deletar o tail! pq toda e qualquer alteracao para deletar o tail, comeca pelo head
        Queue<String> nomeNinjaQueue = new LinkedList<>();
        nomeNinjaQueue.add("Narut");
        nomeNinjaQueue.add("Sasuk");
        nomeNinjaQueue.add("Sakur");
        System.out.println("Ninjas na fila: " + nomeNinjaQueue);

        nomeNinjaQueue.poll(); // tira o head da fila // delete
        System.out.println("Ninjas na fila depois do .poll(): " + nomeNinjaQueue);

        nomeNinjaQueue.peek(); //mostrar quem e o novo HEAD
        System.out.println("Ninja no HEAD: " + nomeNinjaQueue.peek());

        if(nomeNinjaQueue.isEmpty()) { // verificar se a lista esta vazia
            System.out.println("A fila esta vazia.");
        }




        scanner.close();
    }


}
