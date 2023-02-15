import java.util.Scanner;

public class Main {

    private static final float TIME = 0;

    public static void main(String[] args) {
        String str = "Hello!";
//        str = str.replace("ll", "oo");


        StringBuilder builder = new StringBuilder();
//        str = builder.toString();

//        builder.append(true);

//        builder.append(true).append(" != ").append(false);
//        builder.deleteCharAt(0);
//        builder.delete();
//        builder.reverse();
//builder.indexOf();
//builder.replace();
//        builder.insert(builder.length()/2, 7.34f);
//builder.subSequence();
//        System.out.println(builder);

//        long begin = System.currentTimeMillis();
//
//        for (int i = 0; i < 20_000; i++) {
//            str += Character.getName(i);
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end-begin);
//
//         begin = System.currentTimeMillis();
//
//        for (int i = 0; i < 20_000; i++) {
//            builder.append(Character.getName(i));
//        }
//
//         end = System.currentTimeMillis();
//        System.out.println(end-begin);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите чего-нибудь: ");
//        String in = scanner.nextLine();
//        System.out.println(in);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первую строку: ");
//        StringBuilder in = new StringBuilder(scanner.nextLine());
//        System.out.println(in);
//        System.out.println("Введите вторую строку: ");
//        StringBuilder in2 = new StringBuilder(scanner.nextLine());
//        System.out.println(in2);
//
//        System.out.println(in.toString().equals(in2));

//        builder.append("sdgjut");
//        builder.toString().contains(builder.toString());
//        builder.toString().replace("sdg", "Sdf");
//        System.out.println(builder);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи 1-ю строку: ");

        StringBuilder lineOne = new StringBuilder(scanner.nextLine());

        System.out.println("Введи 2-ю строку: ");
        StringBuilder lineTwo = new StringBuilder(scanner.nextLine());

        if (lineOne.toString().contains(lineTwo.toString())) {
            int firstIndex = lineOne.indexOf(lineTwo.toString());
            int lastIndex = firstIndex + lineTwo.length();
            System.out.println(lineOne.replace(firstIndex, lastIndex, " Заменили этот кусок "));
        }
        else {
            System.out.println("Совпадений нет");
        }
//

    }
}