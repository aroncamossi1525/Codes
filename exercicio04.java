/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio04 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a=ler.nextInt();
        System.out.print("Digite um numero: ");
        int b=ler.nextInt();
        System.out.print("Digite um numero: ");
        int c=ler.nextInt();
        int soma=c+b+a;
        int quadrado= soma*soma;
        System.out.println("resultado final: "+quadrado);
    }
}
