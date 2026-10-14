package JOGO.src;

public class Personagem {

    private String nome;
    private int nivel;
    private int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void atacar() {

        if (vida > 0) {
            System.out.println(nome + " atacou!");
        } else {
            System.out.println(nome + " ja está derrotado.");
        }
    }

    public void receberDano(int dano) {

        if (dano <= 0) {
            System.out.println("Dano inválido, inimiga derrotado.");
            return;
        }

        vida = vida - dano;
        if (vida < 0){
            vida = 0;
        System.out.println("ocorreu um erro");
        }
        else {
            System.out.println("atacou");
        }
        
        System.out.println(nome + " recebeu " + dano + " de dano.");
        System.out.println("Vida de " + nome + ": " + vida);
    }

    public boolean estaVivo() {

        if (vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInformacoes() {

        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }
}