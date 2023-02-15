import java.util.Scanner;

//            *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
class HW_2 {

    //    1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    public static void charEnt() {
        String test = "GeekBrains";
        System.out.println(test);

        CharSequence seq = "e";
        boolean bool = test.contains(seq);
        System.out.println("Найден 'e'?: " + "Да");

        // return false

        boolean sqFound = test.contains("x");
        System.out.println("Найден 'x'?: " + "Нет");

    }

    //    2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static boolean searchPalindrom(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }

    // 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    public static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    //    4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
    public static String calcMethod(int num1, int num2, char sigh) {
        StringBuilder mathMethod = new StringBuilder();
        mathMethod.append(num1).append(" ").append(sigh).append(" ").append(num2).append(" ").append(" = ");
        switch (sigh) {
            case '+':
                mathMethod.append(num1 + num2);
                break;
            case '-':
                mathMethod.append(num1 - num2);
                break;
            case '*':
                mathMethod.append(num1 * num2);
                break;
        }
        return mathMethod.toString();
    }

    //    5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    public static String replaceEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }

    //    6.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    public static String replaceEqualDiff(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.replace(index, index + 1, "равно").toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер нужной вам задачи:\n" +
                "1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).\n" +
                "2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).\n" +
                "3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.\n" +
                "4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().\n" +
                "5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().\n" +
                "6.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().\n");
        String taskNumber = scanner.nextLine();
        switch (taskNumber) {
            case "1":
                charEnt();
                break;
            case "2":
                System.out.printf("Введите первую строку: ");
                String str1 = scanner.nextLine();
                System.out.printf("Введите вторую строку: ");
                String str2 = scanner.nextLine();
                if (searchPalindrom(str1, str2)) {
                    System.out.println("\nВведенные вами строки являются вращением друг друга");
                } else
                    System.out.println("\nВведенные вами строки НЕ являются вращением друг друга");
                break;
            case "3":
                System.out.printf("Введите строку: ");
                String str3 = scanner.nextLine();
                System.out.printf("\nПереворачиваем строку: %s\n", reverseStr(str3));
                break;
            case "4":
                System.out.println("\nПримеры в виде строк:");
                int a = 3, b = 56;
                System.out.println(calcMethod(a, b, '+'));
                System.out.println(calcMethod(a, b, '-'));
                System.out.println(calcMethod(a, b, '*'));
                break;
            case "5":
                System.out.println("\nПримеры с заменой знака '=' на слово");
                System.out.println(replaceEqual(calcMethod(3, 56, '+')));
                break;
            case "6":
                System.out.println("\nПримеры с заменой знака '=' на слово с использованием replace");
                System.out.println((replaceEqualDiff(calcMethod(3, 56, '-'))));
                break;
        }
    }
}

