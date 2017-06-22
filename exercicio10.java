package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio10 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a idade do atleta: ");
        int idade= ler.nextInt();
        if((idade>=5)&&(idade<=11)){
            System.out.println("O atleta pertence a classe infantil.");
        }else if((idade>=12)&&(idade<=17)){
            System.out.println("O atleta pertence a classe juvenil.");
        }else if(idade>=18){
            System.out.println("O atleta pertence a classe adulto.");
        }else if(idade<5){
            System.out.println("Sem classe definida.");
        }
    }
}
