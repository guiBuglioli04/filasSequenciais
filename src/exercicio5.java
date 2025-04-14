import filas.FilaString;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        FilaString fila = new FilaString();
        Scanner x = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n1- Insere um paciente na fila\n2- Atende 1 paciente\n3- Encerra atendimento\n");
            opcao=x.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do paciente: ");
                    String nome = x.next();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não há pacientes aguardando ");
                    }else{
                        System.out.println("Proximo paciente a ser atendido: "+fila.dequeue());
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Ainda a pacientes aguardando atendimento");
                        opcao=-1;
                    }else
                        System.out.println("Atendimento encerrado");
                    break;
            }


        }while(opcao!=3);
    }
}
