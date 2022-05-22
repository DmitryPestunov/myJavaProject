package school.lesson2;

public class InitializationArray {

    static int [] arr = new int[100];

    public static void initArray(){

            for(int i = 0; i < arr.length; i++){
                arr[i] = i+1;
            }

        for(int i = 0; i<arr.length; i++){              //for demonstration
            System.out.print(arr[i] + " ");

            if(i == arr.length-1) {
                System.out.print("\n");
            }
        }
    }
}
