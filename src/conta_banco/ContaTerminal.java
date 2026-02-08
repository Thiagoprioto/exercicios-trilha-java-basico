package conta_banco;

import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao banco!");
        Thread.sleep(1000);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor digite o numero da agencia (exemplo: 0001): ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome da agencia: ");
        String nomeAgencia = sc.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %04d e seu saldo %.2f já está disponível para saque",
                nomeCliente, nomeAgencia, numero, saldo);

    }
}