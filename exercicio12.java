package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio12 {
    public static void main (String args[]){
       Scanner ler = new Scanner(System.in);
       System.out.print("Informe a opção desejada: ");
       int opcao=ler.nextInt();
        switch(opcao){
            case 1: System.out.println("Cachorro quente: R$6,50");break;
            case 2: System.out.println("X-Salada: R$8,00");break;
            case 7: System.out.println("X-Burguer: R$12,90");break;
            case 15: System.out.println("X-Tudo: R$19,70");break;
            default: System.out.println("Não cadastrado");
        }
    }
}
