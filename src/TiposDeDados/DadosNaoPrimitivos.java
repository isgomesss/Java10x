package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        
        /*
        *dados primitivos: não conseguem receber metodos de maneira padrão.
        *Dados não primitivos: pode colocar metodos para fazer alterações na varial sem mudar o escolpo.
        * Metodos:  */
        
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();   /*TUDO EM MAIUSCULO*/

        System.out.println("Esse texto esta em CAPSLOCk" + nomeEmCaixaAlta);
        System.out.println("Esse texto esta em CAPSLOCk" + nome);
        

        String aldeia = "ALDEIA DA FOIA";
        String aldeiaCaixaBaixa = aldeia.toLowerCase();

        System.out.println("Texto em caixa baixa: " + aldeiaCaixaBaixa);
        
        
        String nome1 = "Sasuke Uchiha";
        String nome2 = "Sasuke Uchiha";

        

        
    }
    
    
}
