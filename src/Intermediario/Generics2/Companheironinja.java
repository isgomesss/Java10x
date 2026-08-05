package Intermediario.Generics2;

public class Companheironinja {
    private String nomeCompanheiro;

    public Companheironinja(String nomeCompanheiro) {
        this.nomeCompanheiro = nomeCompanheiro;
    }

    public String getNomeCompanheiro() {
        return nomeCompanheiro;
    }

    public void setNomeCompanheiro(String nomeCompanheiro) {
        this.nomeCompanheiro = nomeCompanheiro;
    }

    @Override
    public String toString(){
        return "Nome do companheiro: " + nomeCompanheiro;
    }
}
