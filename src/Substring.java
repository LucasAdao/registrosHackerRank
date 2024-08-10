import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A != null){
            A = A.substring(0,1).toUpperCase() + A.substring(1);
        }
        String B=sc.next();
        // O que acontece aqui? o substring (0,1) pega apenas o index a partir do 0 e menor 1, que é o 0. Já quando usamos substring (1), pegamos os indices do 1 em diante! por isso estamos aplicando o uppercase apenas no indice 0!! Eai conseguimos deixar apenas a primeira letra maiuscula!!
        if(B != null){
            B = B.substring(0,1).toUpperCase() + B.substring(1);
        }
        System.out.println(A.length() + B.length());
        if(A.length() > B.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A + " " + B);
    }
}
