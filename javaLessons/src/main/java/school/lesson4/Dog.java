package school.lesson4;

public class Dog extends Animal {
    public static final int MAX_RUN = 500;
    public static final int MAX_SWIM = 10;
    private static int createCount = 0;

    public Dog() {
        createCount++;
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
        createCount++;
    }

    @Override
    public void run(int length) {
        if(length<=MAX_RUN){
            super.run(length);
        }else {
            System.out.println("Собаки столько не бегают");
        }
    }

    @Override
    public void swim(int length) {
        if(length<=MAX_SWIM){
            super.swim(length);
        }else {
            System.out.println("Собаки столько не плавают");
        }
    }


}
