package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio31 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
            System.out.println("Informe o 1° numero entre 0 e 10: ");
            int n1 = ler.nextInt();
                while(n1<0 || n1>10){
                    System.out.println("O numero nao pode ser lido pois esta fora dos padrões informados! Tente novamente");
                        System.out.println("Informe o 1° numero entre 0 e 10: ");
                        n1 = ler.nextInt();  
                }
            System.out.println("Informe o 2° numero entre 0 e 10: ");
            int n2 = ler.nextInt();
                while(n2<0 || n2>10){
                    System.out.println("O numero nao pode ser lido pois esta fora dos padrões informados! Tente novamente");
                        System.out.println("Informe o 2° numero entre 0 e 10: ");
                        n2 = ler.nextInt();  
                }
                
            if(n1==n2){
                System.out.println("Os numeros sao iguais!");
            }
            else if(n1>n2){
                for(;n2<=n1; n2++){
                    for(int i=0; i<10; i++){
                        int result=(n2*i);
                        System.out.println(+n2+"x"+i+"="+result);
                    }
                }
            }
            else if(n2>n1){
                for(;n1<=n2; n1++){
                    for(int i=0; i<10; i++){
                        int result=(n1*i);
                        System.out.println(+n1+"x"+i+"="+result);
                    }
                }
            }
            
    }
}
