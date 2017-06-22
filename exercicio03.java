package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow 
 * 
 */
public class exercicio03 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o lado: ");
        double lado=ler.nextInt();
        System.out.print("Digite a altura: ");
        double altura=ler.nextInt();
        System.out.print("Digite o preco: ");
        double preco=ler.nextInt();
        double area= lado*altura;
        double precodevenda=preco*area;
        System.out.println("Preco de venda: "+precodevenda);
    }
}
