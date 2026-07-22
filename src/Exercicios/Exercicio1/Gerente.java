package Exercicios.Exercicio1;

public class Gerente extends Funcionario {

    String setor;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome +
                ".\nMeu cargo é " + cargo +
                ".\nmeu salario é " + salario +
                ".\nMeu setor é " + setor + ".\n");

    }
}
