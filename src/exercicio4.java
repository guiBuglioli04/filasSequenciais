import filas.FilaInt;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        int opcao;
    Scanner x = new Scanner(System.in);
    FilaInt fila = new FilaInt();


    do{
        System.out.println("\n1- Insera um PID na fila\n2- Colocar um PID em execusão\n3- Desligar computador\n");
        opcao = x.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o valor do PID para botar na fila: ");
                int pid = x.nextInt();
                fila.enqueue(pid);
                break;
            case 2:
                if (fila.isEmpty())
                    System.out.println("não a programas na fila.");
                else {
                    pid = fila.dequeue();
                    System.out.println("programa "+pid+" em execusão");
                    System.out.println("... Processo foi concluido (1-sim)");
                    int resp = x.nextInt();
                    if(resp ==1){
                        System.out.println("Processo "+pid+" concluido.");

                    }else {
                        fila.enqueue(pid);
                        System.out.println("Processo voltou para a fila");
                    }
                }
                break;
            case 3:
                if (fila.isEmpty())
                    System.out.println("Desligando computador.");
                else {
                    System.out.println("Ainda a processos na fila\nDeseja encerrar todos?");
                    int resp = x.nextInt();

                    if(resp==1){
                        while (!fila.isEmpty()){
                            System.out.println("Encerrando o programa: "+fila.dequeue());
                        }
                    }else
                        opcao = -1;
                }
                    break;

            default:
                System.out.println("Opção inválida. ");
        }

    }while(opcao!=3);

    }
}