package JOGO.src;

public class Guerreiro extends Personagem {

    private String arma;

    public Guerreiro(String nome, int nivel, int vida, String arma) {

        super(nome, nivel, vida);

        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public void atacar() {

        if (getVida() > 0) {

            System.out.println(
                getNome() + " atacou usando " + arma + "!"
            );

        } else {

            System.out.println(
                getNome() + " está derrotado e não pode atacar."
            );
        }
    }

    @Override
    public void mostrarInformacoes() {

        System.out.println("===== GUERREIRO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Arma: " + arma);
    }
}