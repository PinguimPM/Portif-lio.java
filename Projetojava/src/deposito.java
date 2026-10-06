package Projetojava.src;

public class deposito extends contacorrente{

        public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("Depósito realizado!");
    } else {
        System.out.println("Depósito inválido.");
    }
 }

}