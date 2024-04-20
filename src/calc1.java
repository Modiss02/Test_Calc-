import java.util.Scanner;

public class calc1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String string = scanner.nextLine();
        String[] values = string.split(" ");
        if (values.length != 3) {
            throw new RuntimeException("Размер выражения не равен 3 элементам");
        }
        String a = values[0];
        String b = values[2];
        String ex = values[1];
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int result;
        if (aInt > 10 || aInt < 1 || bInt > 10 || bInt < 1) {
            throw new ArithmeticException();
        }
        switch (ex) {
            case "-" -> {
                result = aInt - bInt;
            }
            case "/" -> {
                result = aInt / bInt;
            }
            case "*" -> {
                result = aInt * bInt;
            }
            case "+" -> {
                result = aInt + bInt;
            }
            default -> throw new RuntimeException();
        }

        System.out.println(result);


//     Эт альтернатива свичу

//        if (ex.equals("-")) {
//           result = aInt - bInt;
//        } else if (ex.equals("/")) {
//            result = aInt / bInt;
//        } else if (ex.equals("*")) {
//            result = aInt * bInt;
//        } else if (ex.equals("+")) {
//            result = aInt + bInt;
//        } else {
//            throw new RuntimeException();
//        }
//        System.out.println(result);


    }
}

