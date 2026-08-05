package Intermediario;

import Intermediario.Herança.Boruto;
import Intermediario.Herança.Haruno;
import Intermediario.Herança.Hyuga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 16, "Aldeia da Foia", 50, NivelNinja.CHUUNIN, Biju.CHOMEI);
        naruto.habilidadeEspecial();

        System.out.println("-------------------------------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 16, "Aldeia da Foia", 35, NivelNinja.CHUUNIN, Biju.GYUKI);
        sasuke.habilidadeEspecial();

        System.out.println("-------------------------------------------");
        Uchiha itachi = new Uchiha("Itachi Uchiha", 25, "Aldeia da Foia", 60,NivelNinja.JOUNNNIN, Biju.ISOBU);
        itachi.habilidadeEspecial();

        System.out.println("-------------------------------------------");
        Uchiha madara = new Uchiha("Madara Uchiha", 45, "Aldeia da Foia", 90, NivelNinja.HOKAGUE, Biju.KURAMA);
        madara.habilidadeEspecial();



        // POO: Herança: herda caracteristicas, da classe mae para filha. Poupa tempo e codigo.
        // Polimorfismo; cria uma função utilizadas em diferentes casos
        // Encapsulamento; protege as variaveis e classes para não haver vazamento de dados.
    }
}
