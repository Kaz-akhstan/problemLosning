import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Problemlösning strängar del 1");

        System.out.println("Uppgift 1:");
        String r = sc.nextLine();
        r = new stringsClass().reverse(r);
        System.out.println(r);

        System.out.println("Uppgift 2:");
        String c = sc.nextLine();
        c = new stringsClass().camelCase(c);
        System.out.println(c);

        System.out.println("Uppgift 3:");
        String p = sc.nextLine();
        p = new stringsClass().palindrom(p);
        System.out.println(p);

        System.out.println("Problemlösning matematik del 1");

        System.out.println("Uppgift 1:");
    }
}
