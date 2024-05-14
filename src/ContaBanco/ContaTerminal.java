package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contas contas = new Contas();

        System.out.println("Por favor, digite o número da Agência !");
        contas.setAgencia(input.nextLine());

        System.out.println("Por favor, digite o número da sua conta !");
        contas.setNumero(input.nextInt());

        input.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        contas.setNomeClient(input.nextLine());

        System.out.println("Por favor, digite o seu saldo atual !");
        contas.setSaldo(input.nextDouble());

        System.out.println("Olá " + contas.getNomeClient() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                contas.getAgencia() + " conta " + contas.getNumero() + " e seu saldo " + contas.getSaldo() + " já esta disponivel para o saque");

    }
}
