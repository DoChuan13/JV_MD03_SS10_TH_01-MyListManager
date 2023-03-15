package myList;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        //Method tăng gấp đôi kích thước mảng và sao chép mảng
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        //Kiểm tra kích thước mảng có thỏa mãn kích thước thực?? => nhân đôi kích thước (nếu cần), thêm phần tử và tăng bộ đếm kích thước mảng thực
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        //tìm kiếm phần tử thứ i trong mảng và trả ra
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return (E) elements[i];
        }
    }
}
