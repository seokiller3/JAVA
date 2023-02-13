
import java.util.Arrays;
import java.util.Random;

public class Main {

//    int x = 'f';

//    public static void main(String[] args) {
//        int[] ints = new int[10];
//        ints[4] = 5; //Integer.parseInt("56");
//
////        System.out.println(String.valueOf(5.30f));
////        System.out.println(Integer.toBinaryString(1234234));
//
//        Random random = new Random();
////
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = random.nextInt(100);
//            if (ints[i] % 2 != 0) ;
//                System.out.println(ints[i]);
//        }
//
//        int[] tmp = new int[ints.length + ints.length / 2 + 1];
//        for (int i = 0; i < ints.length; i++) {
//            tmp[i] = ints[i];
//        }
//        ints = tmp;
//        System.out.println(Arrays.toString(ints));
//
//        String str = "Hello! World!Big";
//        str += "?";
//        String str2 = "Hello";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        if (str.equals(str2)) System.out.println("Equal");
//        if (str.contains(str2)) System.out.println("Contains");
//        System.out.println("Hi!".repeat(5));
//        System.out.println(str.replace(str2, "Big"));
//
//        String[] sStr = str.split("!");
//
//        int a = 0;
//    }

    //    1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//    Пункты реализовать в методе main
//*Пункты реализовать в разных методах

//    public static void main(String[] args) {
//        int i = RandomNumber();
//        System.out.println(i);
//        int n = BinToString();
//        System.out.println(n);
//        int[] m1 = MassiveNumbs(i, n);
//        System.out.print(Arrays.toString(m1));
//    }
//
//    public static int RandomNumber() {
//        int i = new Random().nextInt(0, 2000);
//        return i;
//    }
//
//    public static int BinToString() {
//        int n = Integer.toBinaryString(RandomNumber()).length();
//        return n;
//    }
//
//    public static int[] MassiveNumbs(int cnt1, int index1) {
//        for (int j = RandomNumber(); j < Short.MAX_VALUE; j++) {
//            if (j % BinToString() == 0) {
//                cnt1++;
//            }
//        }
//        int[] m1 = new int[cnt1];
//        for (int j = RandomNumber(); j < Short.MAX_VALUE; j++) {
//            if (j % BinToString() == 0) {
//                m1[index1++] = j;
//            }
//        }
//        return m1;
//    }

    public static void main(String[] args) {
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);

        int cnt1 = 0;
        for (int j = i + 1; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                cnt1++;
            }
        }
        int[] m1 = new int[cnt1];
        int index1 = 0;
        for (int j = i + 1; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[index1++] = j;
            }
        }
        System.out.println(Arrays.toString(m1));

        int cnt2 = 0;
        for (int j = i - 1; j > Short.MIN_VALUE; j--) {
            if (j % n != 0) {
                cnt2++;
            }
        }
        int[] m2 = new int[cnt2];
        int index2 = 0;
        for (int j = i - 1; j > Short.MIN_VALUE; j--) {
            if (j % n != 0) {
                m2[index2++] = j;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}




