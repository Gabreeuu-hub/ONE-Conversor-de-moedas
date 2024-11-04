
import src.br.com.conversormoedas.ConsumirApi;
import src.br.com.conversormoedas.Operacoes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        double valor = 0;
        ConsumirApi consumirApi = new ConsumirApi();
        Operacoes operacoes = new Operacoes();

        while (escolha != 7) {
            operacoes.menu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    operacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumirApi.apiService("BRL", "USD", valor);
                    break;
                case 2:
                    operacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumirApi.apiService("USD", "BRL", valor);
                    break;
                case 3:
                    operacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumirApi.apiService("BRL", "EUR", valor);
                    break;
                case 4:
                    operacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumirApi.apiService("EUR", "BRL", valor);
                    break;
                case 5:
                    operacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumirApi.apiService("BRL", "ARS", valor);
                    break;
                case 6:
                    operacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumirApi.apiService("ARS", "BRL", valor);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }

        }

    }
}
