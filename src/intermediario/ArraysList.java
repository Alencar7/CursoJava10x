package intermediario;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {

        //Array
        // Arrays Sao estaticos, nao alteram de tamanho(prioriza a memoria)
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        //Printando Array unitario
        System.out.println("Printando Array Unitario = " + ninjasArray[1]);

        //Printando Array inteiro
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("ninjasArray[" + i + "] = " + ninjasArray[i]);
        }


        //Listas
        // Listas nao sao estaticas, podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha"); // index 1
        ninjasList.add("Sakura Haruno");

        //add = Adicionar na Lista
        ninjasList.add("Kakashi Hatake");
        System.out.println("ninjasList: " + ninjasList);

        //remove = remover elemento da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList: " + ninjasList);

        //.set = Trocar elementos => .set(Index,NovoValor)
        ninjasList.set(1, "Sasuke Uchiha Trocado");
        System.out.println("ninjasList: " + ninjasList);

        //.size = Ver tamanho da lista
        System.out.println("Tamanho Lista = " + ninjasList.size());

    }
}
