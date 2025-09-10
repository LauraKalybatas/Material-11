//referente ao exercicio 2 na apostila

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[][] m = new int[5][5];
        int maior = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(0, 100);
                System.out.print(m[i][j] + "\t");

                if(maior < m[i][j]){
                    maior = m[i][j];
                }


            }
            System.out.println();
        }
        System.out.println("Maior numero --> " + maior);

        //imprime a localização do maior valor
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(m[i][j] == maior){
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
