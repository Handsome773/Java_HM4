import java.util.*;

public class Calculator {
    static void getValue() {
        String[] operation = {"-", "+", "*", "/"};
        Deque<Double> listResult = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double first = scanner.nextDouble();
        while (true) {
            System.out.println("Для выхода введите \"0\".");
            System.out.println("Для отмены операции введите \"1\".");
            System.out.println("Для продолжения введите операцию: ");
            String str = scanner.next();
            if (str.equals("0")) {
                System.out.println("Bay, bay.");
                System.exit(1);
            } else if (str.equals("1")) {
                if(listResult.size() > 1){
                    listResult.removeLast();
                    first = listResult.getLast();
                    continue;
                }else{
                    System.out.println("Введите первое число: ");
                    first = scanner.nextDouble();
                    continue;
                }
            } else if (!Arrays.asList(operation).contains(str)) {
                System.out.println("Нет такой операции.");
                continue;
            }
            System.out.println("Введите второе число: ");
            double second = scanner.nextDouble();
            String value = String.format("%.2f %s %.2f = ", first, str, second);
            double result = 0;
            switch (str) {
                case "-" -> result = first - second;
                case "+" -> result = first + second;
                case "*" -> result = first * second;
                case "/" -> {
                    if (second == 0) {
                        System.err.println("На ноль делить нельзя.");
                        continue;
                    } else {
                        result = first / second;
                    }
                }
            }
            System.out.printf("%s%.2f\n", value, result);
            listResult.addLast(result);
            first = result;
        }
    }
}