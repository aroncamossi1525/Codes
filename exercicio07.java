package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio07 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n= ler.nextInt();
        System.out.print("Digite um número: ");
        int x= ler.nextInt();
        int result=0;
        
        if((n>0)&&(x>0)){
            if(n>x){
                result=n-x;
            }else if (x>n){
                result=x-n;
            }
        System.out.println("A diferença entre os números é: "+result);
        }else{
            System.out.println("Pelo menos um dos números não atinge os requisitos.");
        }
    }
}
