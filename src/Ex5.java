//referente ao exercicio 5 na apostila

import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd =  new Random();

        int totalLinha, totalColuna;
        System.out.print("Total de linhas ---> ");
        totalLinha = sc.nextInt();
        System.out.print("Total de colunas ---> ");
        totalColuna = sc.nextInt();

        //int ordem = rd.nextInt(1,6);
        int[][] m = new int[totalLinha][totalColuna];
        int[][] mt = new int[totalColuna][totalLinha];

        //gerando e imprimindo a matriz m
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = rd.nextInt(11);
                mt[j][i] = m[i][j];
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        // gerando e imprimindo a matriz transposta
        System.out.println();
        for(int i = 0; i < mt.length; i++){
            for(int j = 0; j < mt[i].length; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
