package Projetojava.src;

public class saque extends contacorrente{
    double valor;

    public void realizarSaque(contacorrente conta) {

        if (valor > 0 && valor <= conta.saldo) {

            conta.saldo -= valor;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor sacado: R$ " + valor);
            System.out.println("Saldo atual: R$ " + conta.saldo);

        } else {
            System.out.println("Saque inválido!");
        }
    }
    
}
