package school.lesson2;

public class LeapYearCheack {

    public static boolean cheakLeap(int year){
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("true"); //for demonstration
            return true;
        }else {
            System.out.println("false"); //for demonstration
            return false;
        }
    }
}
