package chap10;

interface Box<T> {
    void addItem(T item, int index);
}

class Item<T> implements Box<T> {
    private final T[] array;

    public Item() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addItem(T item, int index) {
        array[index] = item;
    }
    void Print(int index) {
        System.out.println(array[index]);
    }
}

public class Test {
    public static void main(String[] args) {
        Item<String> strObject = new Item<String>();
        strObject.addItem("wow", 0);
        strObject.Print(0);
    }
}
