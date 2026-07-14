package Codições;

public class LaçosDeReoetição {
    public static void main(String[] args) {

        /*Laços de repetição: Vao repetir infinitamente ou ate o parametro ser atendido.
        * While = for
        * */

        //while
        //while {enquanto} (condiçao) { faça }
        //clones++ : clones = clones + 1
        //clones-- : clones = clones - 1

        int clones = 10;
        int maxClone = 0;

        while (clones >= maxClone) {
            System.out.println("Naruto tem quantos clones? " + clones-- );
        }

        //for

        for (int i = clones; i >= maxClone; i--) {
            System.out.println("Naruto tem quantos clones? " + i);

        }


    }
}
