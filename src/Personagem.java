import java.util.Scanner;

public class Personagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Caracteristicas heroi = new Caracteristicas();
        System.out.println("Escolhar o nome do seu Personagem: ");
        heroi.name =(input.nextLine()) ;

        System.out.println("Escolha sua classe: \n[1] - Guerreiro \n[2] - Mago \n [3] - Arqueiro");
        int escolha = input.nextInt();
        if(escolha == 1){
            heroi.classe ="Guerreiro";
            heroi.forca = 15;
            heroi.agilidade = 9;
            heroi.inteligencia= 6;
        } else if (escolha == 2) {
            heroi.classe = "Mago";
            heroi.forca = 7;
            heroi.agilidade = 8;
            heroi.inteligencia = 15;
        } else if (escolha == 3) {
            heroi.classe ="Arqueiro";
            heroi.forca = 6;
            heroi.agilidade = 15;
            heroi.inteligencia= 9;

        }

        heroi.lvl = 1;
        heroi.mostrarStatus();

        // chamei o metedo atacar e passei como argumento uma string "Hydra"
        heroi.atacar("Hydra","Golpe forte");

    }
}
