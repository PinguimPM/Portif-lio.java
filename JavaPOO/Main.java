package JavaPOO;

public class Main {
    public static void main(String[] args){

        lampada lampada = new lampada();
        lampada.cor = "branca";
        lampada.marca = "Positivo";
        lampada.modelo = "bacana";
        lampada.tipo = "agua";
        lampada.voltagem = 19;

        System.out.println("cor: " + lampada.cor);
        System.out.println("marca: " + lampada.marca);
        System.out.println("modelo: " + lampada.modelo);
        System.out.println("tipo: " + lampada.tipo);
        System.out.println("voltagem: " + lampada.voltagem);
    }
}
