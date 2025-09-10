import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][2];

        //ler os dados
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.println("Valor ---> ");
                m[i][j] = sc.nextInt();
            }
        }

        //impressao da matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
