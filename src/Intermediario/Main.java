package Intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar ninja naruto - objeto
        Ninja naruto = new Ninja();
        String hinata;


     //Criar ninja sasuke uchiha - Objeto

        Ninja sasuke = new Ninja(); // inicializa um objeto

        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Foia";


        //Criar ninja sakura - Objeto

        Ninja sakura = new Ninja();

        sakura.nome = "Sakura Haruno";
        sakura.idade = 16;
        sakura.aldeia = "Aldeia da Foia";


         System.out.println("Qual o nome do ninja?");
         naruto.nome = scanner.nextLine();
        System.out.println("Qual a idade do " + naruto.nome);
        naruto.idade = scanner.nextInt();
        System.out.println("Qual a aldeia do " + naruto.nome);
        naruto.aldeia = scanner.next();


        System.out.println(naruto.nome + "\n" + naruto.aldeia + "\n" + naruto.idade + "\n");
        System.out.println(sasuke.nome + "\n" + sasuke.aldeia + "\n" + sasuke.idade + "\n");
        System.out.println(sakura.nome + "\n" + sakura.aldeia + "\n" + sakura.idade);

        // POO: Herança: herda caracteriisticas, da classe mae para filha. Poupa tempo e codigo.
        // Polimorfismo; cria uma função utilizadas em diferentes casos
        // Encapsulamento; protege as variaveis e classes para não haver vazamento de dados.
    }
}
