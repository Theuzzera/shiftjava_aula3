import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        double altura = 0.0, media;

        while (i < 6){
            System.out.println("Digite a altura do " + (i + 1) + "º aluno: ");
            altura = altura + sc.nextDouble();
            i = i + 1;


        }
        media = altura / i;
        System.out.println("A altura média dos alunos é igual a: " + (int)media);
        sc.close();
    }
}
