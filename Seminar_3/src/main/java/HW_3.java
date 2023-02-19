import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


//        *
//        *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
class HW_3 {
    //1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
    public static List<String> colors() {
        List<String> colorList = new ArrayList<>();
        colorList.add("red");
        colorList.add("blue");
        colorList.add("velvet");
        colorList.add("yellow");
        return colorList;
    }

    //2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    public static List<String> iterList(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.set(iterator.next().concat("!"));
        }
        return list;
    }

    //    3. Вставить элемент в список в первой позиции.
    public static List<String> addColor(List<String> list) {
        list.add(0, "orange");
        return list;
    }

    //    4. Извлечь элемент (по указанному индексу) из заданного списка.
    public static String getList(List<String> list) {
        return list.get(3);
    }

    //    5. Обновить определенный элемент списка по заданному индексу.
    public static List<String> replaceElement(List<String> list, String firstElement, String secondElement) {
        list.set(list.indexOf(firstElement), (secondElement));
        return list;
    }

    //     6. Удалить третий элемент из списка.
    public static List<String> removeElement(List<String> list) {
        list.remove(2);
        return list;
    }

    //     7. Поиска элемента в списке по строке.
    public static boolean searchElementStr(List<String> list, String element) {
        if (list.contains(element)) {
            return true;
        } else {
            return false;
        }
    }

    //        8. Создать новый список и добавить в него несколько элементов первого списка.
    public static List<String> colors2() {
        List<String> colorList2 = new ArrayList<>();
        colorList2.add("red");
        colorList2.add("blue");
        colorList2.add("black");
        return colorList2;
    }

    //        9. Удалить из первого списка все элементы отсутствующие во втором списке.
    public static List<String> removeMissing() {
        List<String> colorListA = new ArrayList<>();
        List<String> colorListB = new ArrayList<>();
        colorListA = colors();
        colorListB = colors2();
        colorListA.retainAll(colorListB);
        return colorListA;
    }

    //10. Сортировка списка.
    public static List<String> listSort(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        //1
        System.out.println(colors());
        //2
        System.out.println(iterList(colors()));
        //3
        System.out.println(addColor(iterList(colors())));
        //4
        System.out.println(getList(addColor(iterList(colors()))));
        //5
        System.out.println(replaceElement(addColor(iterList(colors())), "yellow", "yellow!"));
        //6
        System.out.println(removeElement(replaceElement(addColor(iterList(colors())), "yellow", "yellow!")));
        //7
        String searchElem = "blue!";
        System.out.println(searchElementStr(removeElement(replaceElement(addColor(iterList(colors())),"yellow", "yellow!")), searchElem));
        //8
        System.out.println(colors2());
        //9
        System.out.println(removeMissing());
        //10
        System.out.println(listSort(colors()));
    }
}
