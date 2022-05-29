package school.lesson4;

public class Cat extends Animal{
    public static final int MAX_RUN = 200;
    public static final int MAX_SWIM = 0;
    private static int createCount = 0;
    private int appetite;
    private boolean satiety = false;

    public Cat() {
        createCount++;
    }

    public Cat(int appetite) {
        this.appetite = appetite;
        createCount++;
    }

    public Cat(String name, String color, int age, int appetite) {
        super(name, color, age);
        this.appetite = appetite;
        createCount++;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public void run(int length) {
        if(length<=MAX_RUN){
            super.run(length);
        }else{
            System.out.println("Коты столько не бегают");
        }

    }

    @Override
    public void swim(int length) {
        System.out.println("коты не плавают");
    }

    public void eat(Plate plate){
        if(plate.getFood()>appetite){
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }
}
