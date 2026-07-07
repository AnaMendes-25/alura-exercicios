

import java.util.Scanner;

public class BancoSimulacao {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;
        float saldo = 1000;
        String nome = "Ana Mendes";
        String tipoConta = "Corrente";

        System.out.printf("""
                ***************************
                
                Nome do cliente: %s
                Tipo de conta:   %s
                Saldo atual:     %f
                
                ***************************
                """, nome, tipoConta, saldo);


        while (opcao != 4) {

            System.out.println("""
                    
                    Operações
                    
                    1- Consultar saldos
                    2-Receber valor
                    3- Transferir valor
                    4- sair
                    
                    Digite a sua opção:""");

            opcao = leitor.nextInt();

            if (opcao == 1) { System.out.println("O seu saldo é: " + saldo); }

            else if (opcao == 2) {
                System.out.println("Digite o valor a ser recebido:");
                float valorReceber = leitor.nextFloat();
                saldo += valorReceber;
                System.out.println("Saldo atual: " + saldo);
            }

            else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido:");
                float valorTransferir = leitor.nextFloat();
                if (saldo > valorTransferir) {
                    saldo -= valorTransferir;
                    System.out.println("Saldo atual: " + saldo);
                }
                else {
                    System.out.println("Não há valor suficiente para essa transferência:");
                    System.out.println("Saldo atual: " + saldo);
                }

            }

            else if (opcao == 4){ System.out.println("Encerrando o sistema..."); }

            else {
                System.out.println("Opção inválida.");
            }

        }

    }
}
