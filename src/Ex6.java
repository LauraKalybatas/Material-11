//referente ao exercicio 4 da apostila

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("R$#,##0.00");

        String[] produto = {"Eletronicos", "Roupas", "Alimentos"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        double[][] venda = new double[produto.length][mes.length];
        double total, somaTotal, maior = 0;
        int index = 0;

        //gerando as vendas
        for(int i = 0; i < venda.length; i++){
            for(int j = 0; j < venda[i].length; j++){
                venda[i][j] = rd.nextDouble(2, 6 );
                System.out.print(df.format(venda[i][j]) + "\t");
            }
            System.out.println();
        }

        //soma do total de vendas por categoria
        System.out.println("--------Total de vendas por categoria--------");
        for(int i = 0; i < venda.length; i++){
            total = 0;
            for(int j = 0; j < venda[i].length; j++){
                total += venda[i][j];
            }
            System.out.println(produto[i] + " ---> " + df.format(total));
        }

        //soma das vendas por mes
        System.out.println("---------Total de vendas por mes--------");
        for(int j = 0; j < mes.length; j++){
            total = 0;
            for(int i = 0; i < venda.length; i++){
                total = venda[i][j];
            }
            System.out.println(mes[j] + " ---> " + df.format(total));

            if(total > maior){
                maior = total;
                index = j;
            }
        }
        System.out.println("Mes com o maior total de vendas ---> " + mes[index]);

    }
}
