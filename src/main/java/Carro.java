import java.util.*;
import java.util.stream.IntStream;

public class Carro {

    private TiposCarro tipo;
    private int qtdePessoas;

    Scanner ent = new Scanner(System.in);

    public String verificaQuantidadePessoasCarro(int qtdePessoas){
        String mensagem;
       if(qtdePessoas > tipo.qtdePessoasTipo){
          mensagem = "Quantidade de pessoas ultrapassa a quantidade permitida do tipo de veículo.";
          return mensagem;
       }else if(qtdePessoas < tipo.qtdePessoasTipo){
           mensagem = "Quantidade de pessoas menor que a quantidade permitida do tipo de veículo.";
           return mensagem;
       }else
           mensagem = "Quantidade de pessoas na capacidade max do veículo!";
           return mensagem;
    }

    public String alocaPessoasVeiculo(int qtdePessoas){
        String mensagem = null;
        int escolha;
        boolean testaloop = false;

        System.out.println(verificaQuantidadePessoasCarro(qtdePessoas) + "\nQuantidade maxima suportada pelo tipo do veiculo: " + tipo.getQtdePessoasTipo() + " pessoas!");
        System.out.println("\nDigite o número referente a opção escolhida: \n1 - Remover pessoas \n2 - Adicionar pessoas ");

        escolha = ent.nextInt();
        while(escolha >= 1 || escolha <=2 ){
            switch (escolha){
                case 1:
                    qtdePessoas = removerPessoa(qtdePessoas);
                    testaloop = true;
                    break;
                case 2:
                    qtdePessoas = adicionarPessoa(qtdePessoas);
                    testaloop = true;
                    break;
                default:
                    System.out.print("Opção Inválida! Digite um numero valido: ");
                    escolha = ent.nextInt();
            }
            if(testaloop == true){
                testaloop = false;
                break;
            }else{

            }

        }

        System.out.println("\nQuantidade de pessoas atual para o veiculo: " + qtdePessoas + "!!");
        System.out.println("Deseja alocar novamante? \n1 - sim  \n2 - não ");
        escolha = ent.nextInt();

        while(escolha != 1 || escolha != 2 ){
            switch (escolha){
                case 1:
                    alocaPessoasVeiculo(qtdePessoas);
                    testaloop = true;
                    break;
                case 2:
                    mensagem = ("Alcação concluída\nQuantidade de pessoas no veiculo: " + qtdePessoas + "!!");
                    testaloop = true;
                    break;
                default:
                    System.out.print("Opção Inválida! Digite um numero valido:\n\n");
                    escolha = ent.nextInt();
            }
            if(testaloop == true){
                testaloop = false;
                break;
            }else{

            }
        }

    return mensagem;

    }

    public int removerPessoa(int qtdePessoas){
        System.out.println("Qual a quantidade de pessoas deseja remover: ");
        int qtdeRemocao = ent.nextInt();
        qtdePessoas -= qtdeRemocao;
        return  qtdePessoas;
    }

    public int adicionarPessoa(int qtdePessoas){
        System.out.println("Qual a quantidade de pessoas deseja adicionar: ");
        int qtdeAdicao = ent.nextInt();
        qtdePessoas += qtdeAdicao;
        return  qtdePessoas;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public TiposCarro getTipo() {
        return tipo;
    }

    public void setTipo(TiposCarro tipo) {
        this.tipo = tipo;
    }
}
