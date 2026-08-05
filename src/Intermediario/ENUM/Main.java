package Intermediario.ENUM;

public class Main {
    public static void main(String[] args) {

        //Utilizado para padronizar o codigo. So pode ser utilizado
        //quando temos certeza, que algo nao possa mudar
        //Por boa pratica, utilizar sempre em letras maiusculas

        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.S);
        missao1.exibirDetalhes();

    }
}