package Intermediario.Queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        String[] stringsArray = new String[3];

        //List
        List<String> stringList = new ArrayList<>();

        //Stack
        Stack<String> stringStack = new Stack<>();

        //Queue - Fila
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Naruto Uzumaki");
        stringQueue.add("Sasuke Uchiha");
        stringQueue.add("Sakura Haruno");

        //Mostrar fila
        System.out.println("Ninjas na fila: " + stringQueue);

        //Tirar um ninja da fila
        stringQueue.poll();
        System.out.println("Ninjas apos poll: " + stringQueue);

        //Como ver o primeiro
        System.out.println("Ninja no head: " + stringQueue.peek());

        //Esvaziar fila
        stringQueue.poll();
        stringQueue.poll();
        System.out.println("Ninjas na fila: " + stringQueue);

        //Verificar se a fila esta vazia
        if (stringQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }
    }
}
