package school;

import school.lesson4.*;


public class Runner {
    public static void main(String[] args) {

        Dog sharik = new Dog("sharik", "black", 2);
        Cat barsik = new Cat("barsik", "white-black", 5, 2);

        sharik.run(150);
        barsik.run(150);

        Plate plate = new Plate(20);

        Cat [] catFlock = {new Cat(5), new Cat(10), new Cat(15)};

        System.out.println(Dog.getCreateCount() + " created Dog object");
        System.out.println(Cat.getCreateCount() + " created Cat object");

        System.out.println("Food amount " + plate.getFood());
        for (Cat cat : catFlock) {
            cat.eat(plate);
            System.out.println(cat.isSatiety());
        }
        System.out.println("Food amount " + plate.getFood());

        plate.addFood(3);
        System.out.println("Food amount " + plate.getFood());

        Payment payment = new Payment();
        payment.buy("buy1", 2);
        payment.buy("buy2", 2);
        payment.buy("buy3", 3);
        payment.showMyPurchases();

        Park park = new Park();
        park.attraction("name1", "11.00-18.00", 100);
        park.attraction("name2", "12.00-18.00", 200);
        park.attraction("name3", "13.00-18.00", 300);
        park.showAttractionList();

    }
}