import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = Main.calc(input);
        System.out.println(result);

    }
    public static String calc(String input) throws Exception {

        String[] values = input.split(" ");
        if (values.length != 3) {
            throw new Exception();
        }
        String a = values[0];
        String b = values[2];
        String ex = values[1];
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int result;
        if (aInt > 10 || aInt < 1 || bInt > 10 || bInt < 1) {
            throw new Exception();
        }
        switch (ex) {
            case "-" -> result = aInt - bInt;
            case "/" -> result = aInt / bInt;
            case "*" -> result = aInt * bInt;
            case "+" -> result = aInt + bInt;
            default -> throw new Exception();
        }
        return String.valueOf(result);
    }
}