package Exercicios.Exercico5Generics;

public class Pergaminho {

    private String nomeFeitico;

    public Pergaminho( String nomeFeitico){
        this.nomeFeitico = nomeFeitico;
    }

    public String getNomeFeitico(){
        return nomeFeitico;
    }

    public void setNomeFeitico(){
        this.nomeFeitico = nomeFeitico;
    }

    public String toString(){
        return "Nome do feitiço: " + nomeFeitico;
    }
}
