package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio30 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
            System.out.println("Informe a população de mosquitos: ");
            int mosq = ler.nextInt();
            System.out.println("Informe a quantidade de meses que deseja calcular: ");
            int mes = ler.nextInt();
                for(int i=0; i<mes; i++){
                        mosq=(mosq+((mosq/100)*7));
                        int popt=(int)mosq;
                    System.out.println("Depois de correr o "+(i+1)+"° mês a população total de mosquitos é de: "+popt+" mosquitos");
                }
    }
}
