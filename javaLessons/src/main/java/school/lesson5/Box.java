package school.lesson5;

import java.util.ArrayList;
import java.util.Collection;

public class Box <T extends Fruit>{
    private ArrayList <T> box = new ArrayList<T>();

    public ArrayList<T> getBox() {
        return box;
    }

    public void setBox(ArrayList<T> box) {
        this.box = box;
    }

    public void clear() {
        box.clear();
    }

    public boolean compare(Box box1){
        return WeightFruits.getWeight(this) == WeightFruits.getWeight(box1);
    }

    public void shift (Box <T> shiftBox){
        ArrayList shift = shiftBox.getBox();
        this.box.addAll(shift);
        shiftBox.clear();
    }

    public void add(T frt){
        box.add(frt);
    }

}