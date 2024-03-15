import com.sun.source.tree.WhileLoopTree;

import java.util.Optional;
import java.util.Scanner;

public class EstruturaMenu {

    public static void main(String[] args) {

        //REFAZER EXERCICIO DE ESCOLHA DAS OPÇÕES DO SWITCH CASE ATÉ QUE O USUÁRIO QUEIRA SAIR

        Scanner sc = new Scanner(System.in);
        double dolar, reais=4.99, conversao;
        dolar = sc.nextDouble();
        conversao = dolar * reais;
        System.out.println("O valor convertido em Reais é igual a R$:" + conversao);
    }
}
