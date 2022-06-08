package school.lesson4;

public class Plate {

    private int food;

    public Plate() {
    }

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void showContein(){
        System.out.println(food);
    }

    public void balanceFood(){
        System.out.println(food);
    }

    public void decreaseFood(int amount) {
            food -= amount;
    }

    public void addFood(int addFood){
        food += addFood;
    }
}
