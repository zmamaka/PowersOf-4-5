import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nbr;

        System.out.print("Değer giriniz => ");
        nbr = scan.nextInt();

        for (int i = 1; i <= nbr; i *= 4)
            System.out.println("4'ün kuvveti => " + i);

        System.out.print("\n");

        for (int j = 1; j <= nbr; j *= 5)
            System.out.println("5'in kuvvetleri => " + j);

    }
}
