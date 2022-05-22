package school.lesson2;

public class PositiveCheck {
    private int a;

    public PositiveCheck(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void check(){

        if(getA()>=0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
