package Projetojava.src;

public class contacorrente {

    double saldo;
    int numconta;
    String nomeuser;
    String banco;
    int unidade;
    boolean ativo;

    public void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
        saldo -= valor;
        System.out.println("Saque realizado!");
    } else {
        System.out.println("Saque inválido.");
    }
}

}
