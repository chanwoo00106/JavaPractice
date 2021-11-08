package chap10;

class MyArray<T> {
    T element;

    void setElement(T element) {this.element = element;}
}

class MadPlay<T> {
    private T vale;

    public T getVale() {
        return vale;
    }

    public void setVale(T vale) {
        this.vale = vale;
    }
}

interface Box<T> {
    void addItem(T t, int index);
}

class Item<T> implements Box<T> {
    private final T[] array;

    public Item() {

        array = (T[]) new Object[10];
    }

    @Override
    public void addItem(T t, int index) {
        array[index] = t;
    }

    void Print(int index) {
        System.out.println(array[index]);
    }
}

public class 그건상관없어요 {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<Integer>();

        Item<String> strObject = new Item<>();
        strObject.addItem("Hello", 0);
        strObject.Print(0);
    }
}
