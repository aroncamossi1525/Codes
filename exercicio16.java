package exercicios_aula;

import java.util.Scanner;
/**
 *
 * @author Arow
 */
public class exercicio16 {
    public static void main ( String args[]){
        Scanner ler = new Scanner (System.in);
        int n=1;
        while(n<=50){
            System.out.print("Digite o nome da "+n+"° pessoa: ");
            String nome = ler.next();
            System.out.println("O nome da pessoa "+n+"° é: "+nome);
            n++;
        }
    }  
}
