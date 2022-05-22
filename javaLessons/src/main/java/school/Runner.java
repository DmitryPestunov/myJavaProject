package school;

import school.lesson2.*;

public class Runner {
    public static void main(String[] args) {

       InclusiveNumber checkInclusive = new InclusiveNumber();

        checkInclusive.checkInclusive(5,15);

        PositiveCheck checkPositive = new PositiveCheck(5);

        checkPositive.check();

        NegativeCheck.negativeCheck(0);

        PrintString.print("Hello", 2);

        LeapYearCheack.cheakLeap(2020);

        ChangeElementsArray.changeElements();

        InitializationArray.initArray();

        MultiplicationLessSix.mul();

        ChangeDiagonal.change();

        InitialValueArray.initArr(3,88);

        int [] i = {1 , 2, 3, 4};

        ArrayShift.shift(i, -2);
    }
}
