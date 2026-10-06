package Projetojava.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char opcao;

        contacorrente contacorrente = new contacorrente();
        saque saque = new saque();
        deposito deposito = new deposito();

        contacorrente.saldo = 10000.00;
        contacorrente.banco = "nubank";
        contacorrente.nomeuser = "milton";
        contacorrente.numconta = 81418;
        contacorrente.unidade = 03;
        contacorrente.ativo = true;

        System.out.println("A - Saque");
        System.out.println("B - Depositar");
        System.out.println("C - Informações da conta");

        System.out.print("Selecione a opção: ");
        opcao = entrada.next().toUpperCase().charAt(0);

        switch (opcao) {

            case 'A':
                System.out.println("Área de saque");
                break;

            case 'B':
                System.out.println("Área de depósito");
                break;

            case 'C':
                
                System.out.println("===== CONTA CORRENTE =====");

                System.out.println("Saldo: " + contacorrente.saldo);
                System.out.println("Banco: " + contacorrente.banco);
                System.out.println("Nome: " + contacorrente.nomeuser);
                System.out.println("Número da conta: " + contacorrente.numconta);
                System.out.println("Unidade: " + contacorrente.unidade);
                System.out.println("Ativo: " + contacorrente.ativo);

                break;

            default:
                System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}