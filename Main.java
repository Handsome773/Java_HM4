import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int listSize = 20;
        LinkedList<Integer> listInt = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            listInt.add(listSize - i);
        }
        MyList myList = new MyList(listInt);
//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
//который вернет “перевернутый” список.
        System.out.println(listInt);
        LinkedList<Integer> temp = myList.reverse(listInt);
        System.out.println(temp);

//2) Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
        myList.enqueue(55);
        myList.enqueue(32);
        System.out.println(myList.getMyList());
        int deleteFirst = myList.dequeue();
        System.out.printf("Удалить значение первого элемента - %d\n",
                deleteFirst);
        System.out.println(myList.getMyList());
        int first = myList.first();
        System.out.printf("Значение первого элемента - %d\n", first);
        System.out.println(myList.getMyList());
//3) В калькулятор добавьте возможность отменить последнюю операцию.
        Calculator.getValue();
    }
}