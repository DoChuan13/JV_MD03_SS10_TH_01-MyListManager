package myList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println(listInteger.get(4));
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(1));
        listInteger.get(1);
        System.out.println("Element 6: "+listInteger.get(1));
    }
}
