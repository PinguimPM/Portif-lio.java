package Metodos;

public class Main {
    public static void main(String[] args){

        luffy luffy = new luffy();
        luffy.nome = "luffy";
        luffy.recompensa = 3000000000L;
        luffy.tesouro = "thounsand_sunny";
        luffy.sonho = "ser o rei dos piratas";


        System.out.println("seu nome é: " +  luffy.nome);
        System.out.println("sua recompensa é: " +  luffy.recompensa);
        System.out.println("seu tesouro é: " +  luffy.tesouro);
        System.out.println("seu sonho é: " +  luffy.sonho);

        luffy.atacar();

        sanji sanji = new sanji();
        sanji.nome = "sanji";
        sanji.recompensa = 10000000L;
        sanji.tesouro = "thounsand_sunny";
        sanji.sonho = "ser o melhor cozinheiro";


        System.out.println("seu nome é: " +  sanji.nome);
        System.out.println("sua recompensa é: " +  sanji.recompensa);
        System.out.println("seu tesouro é: " +  sanji.tesouro);
        System.out.println("seu sonho é: " +  sanji.sonho);

        sanji.atacar();

         zoro zoro = new zoro();
        zoro.nome = "zoro";
        zoro.recompensa = 200000000L;
        zoro.tesouro = "thounsand_sunny";
        zoro.sonho = "ser o melhor espadachim";


        System.out.println("seu nome é: " +  zoro.nome);
        System.out.println("sua recompensa é: " +  zoro.recompensa);
        System.out.println("seu tesouro é: " +  zoro.tesouro);
        System.out.println("seu sonho é: " +  zoro.sonho);

        zoro.atacar();

        nami nami = new nami();
        nami.nome = "nami";
        nami.recompensa = 1500000L;
        nami.tesouro = "thounsand_sunny";
        nami.sonho = "conhecer o oceano";

        System.out.println("seu nome é: " +  nami.nome);
        System.out.println("sua recompensa é: " +  nami.recompensa);
        System.out.println("seu tesouro é: " +  nami.tesouro);
        System.out.println("seu sonho é: " +  nami.sonho);

        nami.atacar();

        pirata pirata = new pirata();
        pirata.nome = "cleiton";
        System.out.println("seu nome é: " + pirata.nome);
        pirata.atacar();

    }
    
}
