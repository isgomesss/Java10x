package Intermediario.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinjas kunai = new EquipamentosNinjas("Kunai de ferro");
        EquipamentosNinjas shuriken = new EquipamentosNinjas("Shuriken");
        EquipamentosNinjas pergaminho = new EquipamentosNinjas("Pergaminho");

        BolsaGenerica<EquipamentosNinjas> bolsagenerica = new BolsaGenerica<>();
        bolsagenerica.adcionarEquipamento(kunai);
        bolsagenerica.adcionarEquipamento(shuriken);
        bolsagenerica.adcionarEquipamento(pergaminho);

        System.out.println(bolsagenerica);
    }
}
