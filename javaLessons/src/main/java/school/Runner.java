package school;

import school.lesson5.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        String[] arr = new String[] {"q", "w", "e"};

        System.out.println(Arrays.toString(arr));
        ChangeElementsArray.twoElementsChange(arr,1,3);
        System.out.println(Arrays.toString(arr));

        Box<Apple> applesBox = new Box<>();
        Box<Orange> orangesBox = new Box<>();
        Box<Apple> applesBox2 = new Box<>();

        applesBox.getBox().add(new Apple());        //we can use for() here, but it's don't need now
        applesBox.getBox().add(new Apple());
        orangesBox.getBox().add(new Orange());
        orangesBox.getBox().add(new Orange());
        applesBox2.getBox().add(new Apple());
        applesBox2.getBox().add(new Apple());

        System.out.println(WeightFruits.getWeight(applesBox));
        System.out.println(applesBox.compare(orangesBox));
    }
}
