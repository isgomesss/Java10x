package Intermediario.Generics2;

public class Main {
    public static void main(String[] args) {

       BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
       bolsaNinja.adicionarferramentas(new Kunai("Kunai Explosiva"));
       bolsaNinja.adicionarferramentas(new Shuriken(3));
       bolsaNinja.adicionarferramentas(new Pergaminho("Invocação do sapo"));
       bolsaNinja.adicionarferramentas(new Companheironinja("Mamaro"));

        System.out.println("Itans da nossa bolsa ninja: ");
        bolsaNinja.mostrarFerramentas();

    }
}
