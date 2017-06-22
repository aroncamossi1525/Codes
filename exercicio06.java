package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio06 {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int batata= ler.nextInt();
        if((batata>5)&&(batata<20)){
            batata*=batata;
        }else{
            System.out.println("Esse número não atinge os requisitos e não sofre alterações.");
        }
        System.out.println("O resultado final é: "+batata);
    }
}
