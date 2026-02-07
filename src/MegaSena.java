import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    static void main(String[] args) {
        Random generate = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String name = scanner.nextLine();

        System.out.println("Olá, " + name);

        int i = 0;
        while (i < 6) {

                int number = generate.nextInt(60);
                System.out.println(number);
                i++;

        }

    }



}
