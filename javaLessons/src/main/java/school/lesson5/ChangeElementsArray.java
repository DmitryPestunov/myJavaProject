package school.lesson5;

public class ChangeElementsArray {

    public static <T> void twoElementsChange(T [] arr, int firstElem, int secondElem){
        T temp = arr [firstElem - 1];                   //userFriendly count
        arr[firstElem - 1] = arr [secondElem - 1];
        arr [secondElem - 1] = temp;
    }

}
