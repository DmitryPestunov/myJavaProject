package school;

import school.lesson4.*;


public class Runner {
    public static void main(String[] args) {

        Plate plate = new Plate(20);

        Cat [] catFlock = {new Cat(5), new Cat(10), new Cat(15)};

        for (Cat cat : catFlock){
            cat.eat(plate);
            System.out.println(cat.isSatiety());
        }
    }
}
