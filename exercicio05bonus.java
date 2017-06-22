package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio05bonus {
    public static void main(String args []){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num= ler.nextInt();
        if(num>100){
            num+=150;
        }
        System.out.println("O resultado final é: "+num);
    }
}
