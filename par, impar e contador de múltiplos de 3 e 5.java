import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contador = 1;

        do {
            if(contador % 2==0){
                System.out.printf("%d eh par",contador);
            }
            else{
                System.out.printf("%d eh impar",contador);
            }
             if(contador % 5 ==0 && contador % 3==0 ){
                 System.out.printf(", eh multiplo de 3 e 5");
            }
            else if(contador % 3==0){
                System.out.printf(", eh multiplo de 3");
            }
            else if(contador % 5 ==0){
                System.out.printf(", eh multiplo de 5");
            }
             System.out.printf("\n");

            contador++;
        } while (contador <= 50);
    }
}
