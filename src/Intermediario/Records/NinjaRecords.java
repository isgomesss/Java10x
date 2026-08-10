package Intermediario.Records;

public record NinjaRecords(String nome, String email, int idade) {

    /*Regras do Records:
    * Ele cria construtores, get e set automaticos
    * Todos os atributos são Final(Não podem ser alterados)
    * Podemos ter metodos */

    public String nomeMaiusculo(){
        return nome.toUpperCase();
    }
}
