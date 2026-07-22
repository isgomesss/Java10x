package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Naruto", 16, "Foia", TipoHabilidade.NINJUTSU);
        ninjaBasico.mostrarInformacao();
        ninjaBasico.executarHabilidade();
        System.out.println(" ");

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Kakashi", 30, "Foia", TipoHabilidade.TAIJUTSU, "Anbu");
        ninjaAvancado.mostrarInformacao();
        ninjaAvancado.executarHabilidade();
    }
}
