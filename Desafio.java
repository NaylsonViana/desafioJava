import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        //Declarando as variáveis
        String nome = "Bruno";
        String tipoConta = "Corrente";
        double saldo = 1600.20;
        //precisa iniciar o valor da opcao
        int opcao = 0;

        //Concatenação com String
        System.out.println("********************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n********************");

        //TextBox
        String menu = """
                ** Digite sua Opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        //Criando o Menu - com While

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            //Criando os cálculos de acordo com as opções
            if (opcao == 1){
                System.out.println("O saldo atual da sua conta é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo:" + saldo);
                }
            } else if (opcao == 3) {
               System.out.println("Valor recebido: ");
               double valor = leitura.nextDouble();
               saldo += valor;
               System.out.println("Novo saldo: " + saldo);
            } else if(opcao != 4){
                System.out.println("Opção Inválida");
            }

        }
    }
}
