import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int a = 5;
//        String s = "";
//        int[] ar = new int[5];
//
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("true");
//        list.add("Привет!");
//        list.add(1, "one");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.set(1, "Two");
//
//        String s1 = list.get(1);
////        list.remove(1);
////        System.out.println(list.remove("Two"));
//        String[] j = new String[list.size()];
//        list.toArray(j);
//
//        List<String> list1 = new ArrayList<>();
//        list.add("1");
//        list.add("true");
//        list.add("Привет!");
//        list.add(1, "one");
//
//
////        list.subList(1, 12);
//
////        list.forEach(n -> System.out.println(n));
//
//        for (String str : list) {
//            str = "r";
//        }
//
////        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            String str = iterator.next();
////            if (str.equals("1")) {
////                iterator.remove();
////            }
////        }
//        ListIterator<String> iterator = list.listIterator(list.size() - 1);
//        while (iterator.hasPrevious()) {
//            String str = iterator.previous();
//            if (str.equals("1")) {
//                iterator.remove();
//            }
//        }
//        //size > 10 -> size = size*2+1
//        for (int i = 0; i < list.size(); i++) {
////            System.out.println(list.get(i));
//        }
////        System.out.println(list);
////        System.out.println(list1);
////        System.out.println("-".repeat(16)); //removeAll
////        list.retainAll(list1);
////        System.out.println(list);
//        LinkedList<String> list2 = new LinkedList<>();
//        list2.add(0, "Tr");
////        list2.getFirst() get.Last() add.L


        List<String> list = new ArrayList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");
        list.add("Щ");
        list.add("Се");
        list.add("Вос");
        list.add("Девят");
        System.out.println(list);
        for (String el : list) {
            System.out.println(el);
        }
        System.out.println("*".repeat(10));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*".repeat(10));

        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            String el = iterator1.next();
            System.out.println(el);
        }


        ArrayList<String> list2 = new ArrayList<>();
        for (int i = list.size()-1; i >= 0 ; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
//        iterator1 = list.listIterator(list.size());
//        while (iterator1.hasPrevious()) {
//            list3.add(iterator1.previous());
//
//        }
//        System.out.println(list3);

        list.forEach(n ->list3.add(0,n));
        System.out.println(list3);


        int sum=0;
        iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            String el = iterator1.next();
            sum += el.length();
        }
        int average = sum/list.size();
        iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            String el = iterator1.next();
            if (el.length() < average){
                iterator1.remove();
            }
        }
        System.out.println(list);

        list2.removeAll(list);

        System.out.println(list2);
    }
}
