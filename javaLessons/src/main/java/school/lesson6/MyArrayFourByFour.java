package school.lesson6;

public class MyArrayFourByFour {

    public static int convertStringAndSum(String [][] arr) throws MyExceptionArray {

        int sum = 0;

        if (arr.length != 4) new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}