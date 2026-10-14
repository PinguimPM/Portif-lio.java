package JOGO.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int escolha;
        int acao;
        String nomeJogador;
        String nomeInimigo;

        Personagem jogador;
        Personagem inimigo;

        Guerreiro guerreiro = new Guerreiro(
            "O brabo",
            10,
            100,
            "Machado gigante"
        );

        Mago mago = new Mago(
            "davi jones",
            10,
            100,
            "bola de fogo"
        );

        System.out.println("=== RPG ===");
        System.out.println("Escolha seu personagem:");
        System.out.println("1 - Guerreiro o brabo");
        System.out.println("2 - Mago davi jones");

        System.out.print("Escolha: ");
        escolha = entrada.nextInt();

        if (escolha == 1) {
            nomeJogador = "Guerreiro";
            nomeInimigo = "Mago";

            jogador = guerreiro;
            inimigo = mago;

        } else if (escolha == 2) {
            nomeJogador = "Mago";
            nomeInimigo = "Guerreiro";

            jogador = mago;
            inimigo = guerreiro;

        } else {
            System.out.println("Opção inválida.");
            entrada.close();
            return;
        }

        System.out.println("Você escolheu: " + nomeJogador);
        System.out.println("Seu inimigo é: " + nomeInimigo);

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            System.out.println("=== SEU TURNO ===");
            System.out.println("1 - Atacar");
            System.out.println("2 - Ver informações");

            acao = entrada.nextInt();

            if (acao == 1) {

                jogador.atacar();
                inimigo.receberDano(20);

            } else if (acao == 2) {

                jogador.mostrarInformacoes();

            } else {

                System.out.println("Opção inválida.");
            }

            if (!inimigo.estaVivo()) {
                break;
            }

            System.out.println("=== TURNO DO INIMIGO ===");

            inimigo.atacar();
            jogador.receberDano(10);
        }

        entrada.close();
    }
}