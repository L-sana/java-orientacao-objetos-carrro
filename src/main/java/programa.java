import java.util.*;

public class programa {
    public static void main(String[] args) {
        int qtdePessoas, opcao ;

        Scanner entrada = new Scanner(System.in);
        Carro carro = new Carro();

        do {
            System.out.println("Olá, escolha o tipo do veiculo: ");
            System.out.println(" 1 - Onibus");
            System.out.println(" 2 - Van");
            System.out.println(" 3 - Passeio");
            System.out.println(" 4 - Sair do menu");
            System.out.print("Digite uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de Veiculo selecionado Onibus!");
                    System.out.println("Digite a quantidade de pessoas inicialmente você quer colocar no veículo? ");
                    qtdePessoas = entrada.nextInt();
                    carro.setTipo(TiposCarro.ONIBUS);
                    carro.setQtdePessoas(qtdePessoas);
                    System.out.println(carro.alocaPessoasVeiculo(carro.getQtdePessoas()));
                    break;
                case 2:
                    System.out.println("Tipo de Veiculo selecionado Van!");
                    System.out.println("Digite a quantidade de pessoas inicialmente você quer colocar no veículo? ");
                    qtdePessoas = entrada.nextInt();
                    carro.setTipo(TiposCarro.VAN);
                    carro.setQtdePessoas(qtdePessoas);
                    System.out.println(carro.alocaPessoasVeiculo(carro.getQtdePessoas()));
                    break;
                case 3:
                    System.out.println("Tipo de Veiculo selecionado Passeio!");
                    System.out.println("Digite a quantidade de pessoas inicialmente você quer colocar no veículo? ");
                    qtdePessoas = entrada.nextInt();
                    carro.setTipo(TiposCarro.PASSEIO);
                    carro.setQtdePessoas(qtdePessoas);
                    System.out.println(carro.alocaPessoasVeiculo(carro.getQtdePessoas()));
                    break;
                case 4:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.print("Opção Inválida! Digite um numero valido:\n\n");
                    break;
            }

        }while(opcao > 4 || opcao < 1);
    }
}
