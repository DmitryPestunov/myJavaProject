package school.lesson2;

public class InitialValueArray {

    public static int [] arr;

    public static void initArr(int len, int initialValue){
        arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = initialValue;
        }

        for(int i = 0; i<arr.length; i++){              //for demonstration

            System.out.print(arr[i] + " ");

            if(i == arr.length-1) {
                System.out.print("\n");
            }
        }
    }
}
