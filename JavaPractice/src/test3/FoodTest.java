package test3;

class Food {
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void print() {
        System.out.println("name : " + name + ", price : " + price);
    }
}

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Food("치킨", 18000);
        Food pizza = new Food("피자", 28000);
        Food sushi = new Food("초밥세트", 22000);

        Food[] foods = {chicken, pizza, sushi};

        for (int i = 0; i < foods.length; i++){
            foods[i].print();
        }
    }

}
