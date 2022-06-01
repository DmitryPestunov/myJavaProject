package school.lesson5;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList <T> box = new ArrayList<T>();

    public ArrayList<T> getBox() {
        return box;
    }

    public boolean compare(Box box1){
        return WeightFruits.getWeight(this) == WeightFruits.getWeight(box1);
    }

}