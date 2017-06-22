package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow 
 * 
 */
public class exercicio02 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o lado: ");
        double lado=ler.nextInt();
        System.out.print("Digite a altura: ");
        double altura=ler.nextInt();
        double area= (lado*altura)/2;
        System.out.println("Area do retangulo: "+area);
    }
}
