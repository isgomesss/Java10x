package Intermediario.ClassesAbstratasXInterfaces;

public class Main {
    public static void main(String[] args) {

        //obj ninja nao pode criar objeto

        //obj uzumaki
        Uzumaki naruto = new Uzumaki("foia", "naruto", 18, 15, RankNinja.JOUNNNIN);
        naruto.nomeNinja();
        naruto.tacarKunai();
        naruto.tacarUmaShuriken();
        naruto.estrategiaDeBatalhaNinja();
        naruto.metodoProvisorio();
        System.out.println(" ");

        //obj uchiha
        Uchiha itachi = new Uchiha("Foia", "Itachi", 18, 14, RankNinja.CHUUNIN);
        itachi.nome = "Itachi Uchiha";
        itachi.nomeNinja();
        itachi.tacarKunai();
        itachi.estrategiaDeBatalhaNinja();
        itachi.inteligenciaDeCombate();
        itachi.inteligenciaDeCombate(180);
        itachi.metodoProvisorio();


        //interface - todos os metodos sao obrigatoriamente abstrato - atributo estatico, precisa atribuir valor.

        //classe abstrata - todos atributos nao podemos atribuir valor

        //abstração

    }
}
