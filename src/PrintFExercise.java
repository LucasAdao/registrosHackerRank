import java.util.Scanner;

/*Para começar esse portifolio pego esse exercício onde fui surpreendido pelo printf, onde - significa a posição da variavel no sout, e 15s a quantidade de caracteres que ela vai exibir, e %03d, onde 3 é o tamanho de casas decimais, e 0 é o complemento caso a variável não tenha esse número de casas decimais! */
public class PrintFExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");

        scanner.close();
    }
}