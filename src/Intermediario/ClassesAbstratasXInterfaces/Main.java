package Intermediario.ClassesAbstratasXInterfaces;

public class Main {
    public static void main(String[] args) {

        //obj ninja nao pode criar objeto

        //obj uzumaki
        System.out.println("---------------Naruto Uzumaki-------------------");
        Uzumaki naruto = new Uzumaki(18, "Foia", "Naruto");
        System.out.println(naruto);


        //obj uchiha
        System.out.println("---------------Itachi uchiha-------------------");
        Uchiha itachi = new Uchiha(25, "Foia", "Itachi");
        System.out.println(itachi);

    }
}
