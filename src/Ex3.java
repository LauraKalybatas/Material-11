//referente ao exercicio 3 na apostila

import java.text.DecimalFormat;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00°");
        Random rd = new Random();

        double[][] temp = new double[3][6];
        double[] media = new double[temp.length];
        double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        double aux;
        int anoMaior = 0, anoMenor = 0;

        //gerando armazenando e imprimindo os dados
        for(int i = 0; i < temp.length; i++){
            aux = 0;
            for(int j = 0; j < temp[i].length; j++){
                temp[i][j] = rd.nextDouble(0, 100);
                System.out.print(df.format(temp[i][j]) + "\t");

                aux += temp[i][j];
            }
            System.out.println();

            media[i] = aux / temp[i].length;
            if(media[i] > maior){
                maior = media[i];
                anoMaior = i + 1;
            }

            if(media[i] < menor){
                menor = media[i];
                anoMenor = i + 1;
            }
        }

        System.out.println();

        //imprimindo a media de cada ano
        for(int i = 0; i < temp.length; i++){
            System.out.println("Ano " + (i+1) + " ---> " + df.format(media[i]));
        }

        System.out.println();

        //impressao do ano com a maior e menor media
        System.out.println("Ano com a maior media de temperatura ---> " + anoMaior);
        System.out.println("Ano com a menor media de temperatura ---> " + anoMenor);
    }
}
