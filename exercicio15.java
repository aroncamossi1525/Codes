package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio15 {
    public static void main (String args[]){
       Scanner ler = new Scanner(System.in);
       System.out.print("Digite um numero: ");
       double n1=ler.nextDouble();
       System.out.print("Digite outro numero: ");
       double n2=ler.nextDouble();
       System.out.print("Opções:\n\t1: Adição\n\t2: Subtração\n\t3: Multiplicação\n\t4: Divisão\nQual a sua escolha: ");
       int opcao=ler.nextInt();
       double result=0;
        switch(opcao){
            case 1: 
                result=n1+n2; 
                System.out.println("O resultado da soma é: "+result);
                break;
            case 2: 
                result=n1-n2; 
                System.out.println("O resultado da subtração é: "+result);
                break;
            case 3: 
                result=n1*n2; 
                System.out.println("O resultado da multiplicação é: "+result);
                break;
            case 4: 
                result=n1/n2; 
                System.out.println("O resultado da divisão é: "+result);
                break;
            default: System.out.println("Operação inválida!");
        }
    }
}
