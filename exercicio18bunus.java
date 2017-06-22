package exercicios_aula;

import java.util.Scanner;
/**
 *
 * @author Arow
 */
public class exercicio18bunus {
    public static void main (String args[]){
         Scanner ler = new Scanner (System.in);
         
         System.out.print("Informe o valor que deseja economizar: ");
         double eco=ler.nextDouble();
         
         System.out.print("informe o valor a ser depositado mensalmente na poupança: ");
         double men=ler.nextDouble();
         
         System.out.print("Informe a taxa de juros:");
         double taxa=ler.nextDouble();
         
         double total=0;
         int mes=1;
         
         total+=(men+((men/100)*taxa));
         
            while(total<eco){
                mes++;
                total+=(men+((total/100)*taxa)); 
            }
            
        System.out.println("Serão necessarios "+mes+" meses para atingir o valor a ser economizado");
    }
}