import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        Scanner x = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("1- Insere um aluno na fila\n2- Atende 1 aluno\n3- Encerra atendimento");
            opcao = x.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o RM do aluno ");
                    int rm = x.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Atendimento encerrado.");
                default:
                    System.out.println("Opção inválida");
            }

        }while (opcao!=3);

        x.close();
    }


}
