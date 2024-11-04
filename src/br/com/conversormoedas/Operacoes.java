package src.br.com.conversormoedas;

public class Operacoes {

    public void menu () {
        System.out.println("""
                   |------------------------------------------------------|
                   |  1) Real Brasileiro [BRL] --> Dólar [USD]            |
                   |  2) Dólar [USD]  --> Real Brasileiro [BRL]           |
                   |  3) Real Brasileiro [BRL] --> Euro [EUR]             |
                   |  4) Euro [EUR] --> Real Brasileiro [BRL]             |
                   |  5) Real Brasileiro [BRL] --> Peso Argentino [ARS]   |
                   |  6) Peso Argentino [ARS] --> Real Brasileiro [BRL]   |
                   |  7) Sair                                             |
                   |------------------------------------------------------|  
                    """);
        System.out.println("Escolha uma opção: ");
    }

    public void mensagem() {
        System.out.println("Digite o valor para conversão: ");
    }

}
