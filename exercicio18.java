package exercicios_aula;

import java.util.Scanner;
/**
 *
 * @author Arow
 */
public class exercicio18 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int n=ler.nextInt();
        int i=n;
        int result=0;
        result=n;
        
        while(n>1){
            n--;
            result=result*n;
        }
        System.out.print("O fatorial de "+i+" é:"+result);
    }    
}
