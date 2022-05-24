package school.lesson3;

public class Employee {

    private String name;
    private String position;
    private String eMail;
    private int numberPhone;
    private int salary;
    private int age;

    public Employee(String name, String position, String eMail, int numberPhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee:" + "\n" +
                "name = " + name + "\n" +
                "position = " + position + "\n" +
                "eMail = " + eMail + "\n" +
                "numberPhone = " + numberPhone + "\n" +
                "salary = " + salary + "\n" +
                "age = " + age + "\n" ;
    }
}
