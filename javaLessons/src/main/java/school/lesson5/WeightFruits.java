package school.lesson5;

import java.util.ArrayList;

public class WeightFruits {

    public static <T extends Fruit> float getWeight(Box boxFruits){
        ArrayList<T> box = boxFruits.getBox();
        if (box.isEmpty()) {
            return 0;
        } else {
            return box.size() * box.get(0).getWeight();
        }
    }
}
