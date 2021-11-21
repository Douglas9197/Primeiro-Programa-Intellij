import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        double a,b;
        double total;

        System.out.println("calcladora");

        System.out.println("digite 1 para (*), digite 2 para (/), digie 3 para (+), digite 4 (-)");
        num = scan.nextInt();

        if (num == 1 ){

            System.out.println("informe o valor de A: ");
            a = scan.nextDouble();

            System.out.println("informe o valor de B: ");
            b = scan.nextDouble();

            total = a * b;
            System.out.println("o total da multiplicaçao e: "+total);

        }
        if (num == 2 ){

            System.out.println("informe o valor de A: ");
            a = scan.nextDouble();

            System.out.println("informe o valor de B: ");
            b = scan.nextDouble();

            total = a / b;
            System.out.println("o total da divisão é: "+total);

        }

        if (num == 3 ){

            System.out.println("informe o valor de A: ");
            a = scan.nextDouble();

            System.out.println("informe o valor de B: ");
            b = scan.nextDouble();

            total = a + b;
            System.out.println("o total da adção é: "+total);

        }

        if (num == 4 ){

            System.out.println("informe o valor de A: ");
            a = scan.nextDouble();

            System.out.println("informe o valor de B: ");
            b = scan.nextDouble();

            total = a - b;
            System.out.println("o total da subritação é: "+total);

        }



    }
}
