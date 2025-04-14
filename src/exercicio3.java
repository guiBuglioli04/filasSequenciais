import filas.FilaInt;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        Scanner x = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\n1- Insere um aluno na fila\n2- Atende 1 aluno\n3- Encerra atendimento\n");
            opcao = x.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o RM do aluno \n");
                    int rm = x.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if(fila.isEmpty()){
                        System.out.println("\tnão a alunos aguardando a fila\n\t");
                    }else
                        System.out.println("\n\tProximo da fila: "+fila.dequeue()+"\n");
                    break;
                case 3:
                    if(fila.isEmpty())
                        System.out.println("Atendimento encerrado.");
                    else {
                        System.out.println("Ainda a alunos na fila");
                        opcao = -1;
                    }
                        break;
                default:
                    System.out.println("Opção inválida");
            }

        }while (opcao!=3);

        x.close();
    }


}
