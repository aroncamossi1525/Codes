package exercicios_aula;

import java.util.Scanner;

/**
 * @author Arow
 * 
 */
public class exercicio05 {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num= ler.nextInt();
        int cont;
        for(cont=0;num>0;cont++){
            num/=10;
        }
        System.out.println("Numero de casas: "+cont);
    }
}