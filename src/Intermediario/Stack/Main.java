package Intermediario.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> ninjaStack = new Stack<>();

        ninjaStack.push("Naruto ");
        ninjaStack.push("Sasuke ");
        ninjaStack.push("Sakura ");

        System.out.println(ninjaStack); // Printa todos itens da pilha;
        System.out.println(ninjaStack.peek());// Printa o ultimo item adicionado a pilha

        ninjaStack.pop(); // remove o ultimo item da pilha

        System.out.println(ninjaStack);
        System.out.println(ninjaStack.isEmpty()); // Verifica se a pilha esta vazia
    }
}
