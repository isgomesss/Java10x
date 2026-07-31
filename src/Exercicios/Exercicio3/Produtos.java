package Exercicios.Exercicio3;

public class Produtos {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    //Constrtutor
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Get preço
    public double getPreco() {
        return preco;
    }

    //Get quantidade
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //Get nome
    public String getNome() {
        return nome;
    }

    public void setPreco(Float preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Erro!");
        }
    }

    public void setAddEstoque(int qtd) {
        this.quantidadeEstoque = qtd;
    }

    public void mostrarItens(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);

    }
}
