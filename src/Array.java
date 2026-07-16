public class Array {
    public static void main(String[] args) {

        /*Arrays, para agrupar muitas variaveis do mesm tipo, como nome em uma uma (tipo uma lista) endereço q aponta para caixa
        * tipo de referencia: tipo de dado nao primitivo
        * precisa separar um pedaço de memoria para o array - QUANTOS PEDACIHOS DE MEMORIA VAMOS SEPARAR, QUANTIDADE DE NOMES QUE VAMOS USAR
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
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        System.out.println(ninja[2].toUpperCase());
        ninja[3] = "Minato Namikase";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        //For para fazer LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        //iniciliza com 0
        int[] idade = new int[2];
        idade[0] = 1;
        idade[1] = 2;


        int[] array = {1,2,3};
        System.out.println(array[2]);

        char [] letra = {'A','B'};

    }
}
