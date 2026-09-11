import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double[] notas = new Double[6];

        System.out.print("Digite as notas da turma?\n");
        for(int i = 0; i < notas.length; i++){
            notas[i] = leitura.nextDouble();

            while(notas[i] < 0 || notas[i] > 10){
                System.out.print("pow jovi n pode numbers nagatorios, digite novamentekkkk\n");
                notas[i] = leitura.nextDouble();
            }
        }

        Arrays.sort(notas);
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        double media = soma / notas.length;

        System.out.printf("Menor Nota: %.1f\n", notas[0]);
        System.out.printf("Maior Nota: %.1f\n", notas[5]);
        System.out.printf("Média da Turma: %.2f\n", media);
    }
}
