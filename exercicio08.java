package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio08 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1= ler.nextInt();
        System.out.print("Digite um numero: ");
        int n2= ler.nextInt();
        System.out.print("Digite um numero: ");
        int n3= ler.nextInt();
        if((n1>n2)&&(n1>n3)){
            System.out.println("O maior é: "+n1);
        }else if((n2>n1)&&(n2>n3)){
            System.out.println("O maior é: "+n2);
        }else if((n3>n2)&&(n3>n1)){
            System.out.println("O maior é: "+n3);
        }
    }
}
