package JOGO.src;

public class Mago extends Personagem {

    private String tipoMagia;

    public Mago(String nome, int nivel, int vida, String tipoMagia) {

        super(nome, nivel, vida);

        this.tipoMagia = tipoMagia;
    }
public String getTipoMagia() {
        return tipoMagia;
    }

    @Override
    public void atacar() {

        if (getVida() > 0) {

            System.out.println(
                getNome() + " atacou usando magia de "
                + tipoMagia + "!"
            );

        } else {

            System.out.println(
                getNome() + " O mago esta derrotado."
            );
        }
    }
    @Override
    public void mostrarInformacoes() {

        System.out.println("===== MAGO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Tipo de magia: " + tipoMagia);
    }
}
