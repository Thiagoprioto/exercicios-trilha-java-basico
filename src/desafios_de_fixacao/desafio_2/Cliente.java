package desafios_de_fixacao.desafio_2;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws DadosInvalidosException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        boolean dadosValidos = false;

        do {
            try {
                System.out.println("Bem-vindo");
                Thread.sleep(1000);

                System.out.println("digite seu nome: ");
                nome = sc.nextLine();

                System.out.println("Digite sua idade: ");
                idade = sc.nextInt();
                sc.nextLine();

                validarCliente(nome, idade);

                dadosValidos = true;
                System.out.println("Cliente cadastrado!");

            }catch (DadosInvalidosException e){
                System.err.println("Erro: " + e.getMessage());
            }
        }while (!dadosValidos);

    }
    static void validarCliente(String nome, int idade){
        if (nome == null || nome.trim().isEmpty()){
            throw new DadosInvalidosException("Nome é obrigatório.");
        }
        if (idade <= 0 || idade >= 100){
            throw new DadosInvalidosException("Idade inválida: o cliente deve ter entre 0 e 100 anos.");
        }
    }
}
