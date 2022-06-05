package school.lesson6;

public class MyArrayDataException extends MyExceptionArray {

    public MyArrayDataException(int i, int k) {
        super("Error data in: [" + i + "] [" + k + "]");
    }
}
