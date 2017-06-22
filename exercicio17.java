package exercicios_aula;

import java.util.Scanner;
/**
 *
 * @author Arow
 */
public class exercicio17 {
    public static void main( String args[] ){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite ' 0 ' para encerrar a qualquer momento");
        System.out.println("Digite um numero:");
        int n=ler.nextInt();
        int result=0;
        
        while(n!=0){
            result=n*n;
            System.out.println("O quadrado de "+n+" é: "+result);
            System.out.println("Digite um numero:");
            n=ler.nextInt();
        }
    }
    
}
