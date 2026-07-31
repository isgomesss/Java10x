package Exercicios.Exercicio3;

public class Main {
    public static void main(String[] args) {

        Produtos produto1 = new Produtos("Arroz", 19.00);
        produto1.setAddEstoque(10);
        produto1.mostrarItens();
    }
}
