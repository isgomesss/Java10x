package Intermediario;

public class Ninja {


    String nome;
    String aldeia;
    int idade;

    //Criar um metodo publico personalizado
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativou");
    }




    //Metodo String: Obrigatoriamente vai retornar uma String;

    public String euSouUmNinja(){
        return "Oi eu sou um Ninja";
    }

    public int soma(int a, int b){
        return a + b;
    }

    public int anosParaSeTornarHokague(int idade){
        return 35 - idade;
    }
}


