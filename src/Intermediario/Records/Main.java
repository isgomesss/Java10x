package Intermediario.Records;

public class Main {
    public static void main(String[] args) {

        NinjaRecords ninja1 = new NinjaRecords("Naruto", "Naturo@gmail.com", 18);
        System.out.println("Dados do cadastro: " + ninja1);
        System.out.println("Nome maiusculo: " + ninja1.nomeMaiusculo());
    }
}
