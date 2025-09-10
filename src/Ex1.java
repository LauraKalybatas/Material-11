//referente ao exercicio 1 na apostila

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[][] m = new int[4][4];
        int somaPrincipal = 0, somaSecundaria = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = rd.nextInt(1,10);
                System.out.print(m[i][j] + "\t");

                // verifica se estou na diagonal principal
                if(i == j){
                    somaPrincipal += m[i][j];
                }

                // verifica se estou na diagonal secundario
                if(i + j == m.length - 1){
                    somaSecundaria += m[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSoma da diagonal principal = " + somaPrincipal);
        System.out.println("\nSoma da diagonal secundaria = " + somaSecundaria);
    }
}
