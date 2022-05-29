package school.lesson4;

public class Animal {
    private static final int MAX_RUN = 0;
    private String name;
    private String color;
    private int age;
    private static int createCount = 0;

    public Animal() {
        createCount++;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        createCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreateCount() {
        return createCount;
    }

    public void run (int length){
        System.out.println(name + " бежал " + length);
    }

    public void swim (int length){
        System.out.println(name + " плыл " + length);
    }
}
