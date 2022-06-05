package school;

import school.lesson6.*;

public class Runner {
    public static void main(String[] args) throws MyExceptionArray {
        String[][] strArr = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"},
                                            {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        System.out.println(MyArrayFourByFour.convertStringAndSum(strArr));
    }
}
