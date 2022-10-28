package DSA$DanhSach;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //    public boolean addElement(E e){
//        if(e == elements){
//            return true;
//        }else {
//            return false;
//        }
//    }
    public void remove(int index) {
        for (int i = index; i <= size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public Object clone() {
        Object[] a = new Object[size];
        for (int i = 0; i < size; i++) {
            a[i] = elements[i];
        }
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(a) +
                '}';
    }
    public boolean contains(E e){
        for (Object element : elements){
            if( element == e){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        int index;
        for (int i = 0 ; i < size ; i++){
            if(elements[i] == e){
                index= i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
    public Object clear(){
        for (int i = 0; i <= size - 1; i++) {
            elements[i] = null;
        }
        size=0;
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public void addIndex(int index , E element) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size++;
    }
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
