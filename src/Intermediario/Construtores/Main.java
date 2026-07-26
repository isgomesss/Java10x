package Intermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        // CONTRUTORES: 1- sem argumentos:
        //2- com argumentos:

        Senju hashirama = new Senju();
        System.out.println(hashirama.nome);
        System.out.println(hashirama.idade);

        Senju tobirama = new Senju("Matar alguem","foia", true, 16, "Tobirama");
        System.out.println(tobirama.aldeia);
        System.out.println(tobirama.missao);
        tobirama.sabedoriaHogakes();
    }
}
