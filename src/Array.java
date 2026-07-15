public class Array {
    public static void main(String[] args) {

        /*Arrays, para agrupar muitas variaveis do mesm tipo, como nome em uma uma (tipo uma lista) endereço q aponta para caixa
        * tipo de referencia: tipo de dado nao primitivo
        * precisa separar um pedaço de memorIa para o array - QUANTOS PEDACIHOS DE MEMORIA VAMOS SEPARAR, QUANTIDADE DE NOMES QUE VAMOS USAR
        * ELE APONTAAAAAAAAAAA*/

        //inicializa com Null
        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzumki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata ";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[2].toUpperCase());

        //redeclarar array:
        ninja = new String[0];

        //inicia com 0
        int[] idade = new int[2];
        idade[0] = 1;
        idade[1] = 2;
        System.out.println(ninja[0]);

        int[] array = {1,2,3};
        System.out.println(array[2]);

        char [] letra = {'A','B'};

    }
}
