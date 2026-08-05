package Intermediario.ENUM;

public enum RankDeMissoes {
    //Dias da semana
    A("Dificil", 5),
    B("Confortavel", 2),
    C("Moderado",3),
    D("Baixo", 2),
    S("Altissimo",10 );

    //Depois do ; nada mais pode ser um ENUM, não é
    // possivel ter dois

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
