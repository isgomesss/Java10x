package Intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar ninja naruto - objeto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia = "Aldeia da Foia";
        naruto.modoSabio();

        //Criar ninja sasuke uchiha - Objeto
        Uchiha sasuke = new Uchiha(); // inicializa um objeto
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Foia";
        sasuke.sharinganAtivado();

        //Criar ninja sakura - Objeto
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 16;
        sakura.aldeia = "Aldeia da Foia";
        sakura.ativarCura();

        //Ninja Hinara - objeto
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 15;
        hinata.aldeia = "Aldeia da Foia";
        hinata.ativaByakugan();



        // POO: Herança: herda caracteristicas, da classe mae para filha. Poupa tempo e codigo.
        // Polimorfismo; cria uma função utilizadas em diferentes casos
        // Encapsulamento; protege as variaveis e classes para não haver vazamento de dados.
    }
}
