package exercicios_aula;

import java.util.Scanner;

/**
 * Exercicio 01: Calcular area de um retangulo
 * @author Arow 
 * 
 */
public class exercicio01 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o lado: ");
        int lado=ler.nextInt();
        System.out.print("Digite a altura: ");
        int altura=ler.nextInt();
        int area= lado*altura;
        System.out.println("Area do retangulo: "+area);
    }
}