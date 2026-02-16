package desafios_de_fixacao.desafio_1;

import java.util.Scanner;

public class Agendamento {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de barbearia!");
        Thread.sleep(1000);

        System.out.println("Digite o tempo de agendamento");
        int tempo = sc.nextInt();

        try{
            validarTempo(tempo);
        }catch (TempoServicoInvalidoException e){
            System.out.println(e.getMessage());
        }

    }
    static void validarTempo(int minutos){
        if (minutos > 120){
            throw new TempoServicoInvalidoException("Duração muito longa: o serviço não pode ultrapassar 120 minutos.");
        } else if (minutos < 15) {
            throw new TempoServicoInvalidoException("Duração muito curta: o serviço deve ter pelo menos 15 minutos.");
        }
    }
}
