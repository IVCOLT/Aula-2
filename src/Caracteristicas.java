import java.util.Random;

public class Caracteristicas {
    String name;
    String classe;
    int lvl;
    int pv;
    int forca ;
    int agilidade;
    int inteligencia;
    // para subir de nivel - experincia

    void calcularStatus(){
        if (forca >=0){
            forca = forca + lvl * 2;
        } else if (agilidade >= 0) {
            agilidade = agilidade + lvl *2;
        } else if (inteligencia >= 0) {
            inteligencia = inteligencia + lvl *2;
        }
    }
    void mostrarStatus() {
        calcularStatus();
        System.out.format("Personagem: %s ( lvl %d )\n Classe: %s Força: %d\n Agilidade: %d\n Inteligencia: %d\n ", name, lvl,classe, forca ,agilidade  ,inteligencia);
    }

    int calcularDano(){
        Random gerador = new Random();
        //1 ... 20
        // nextInt(): 0 ... 19
        // nextInt(): 0 -> 20
        int dado20f = 1 + gerador.nextInt(19);
        int dano = forca + dado20f;
        return dano;
    }
    void atacar(String alvo, String skill) {
    //
    int Damage = calcularDano();
        if (skill.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n", name, alvo, Damage);
        }else {
            System.out.format("%s usou %s contra %s e causou %d de dano",name,skill , alvo, Damage);
        }
    }
}