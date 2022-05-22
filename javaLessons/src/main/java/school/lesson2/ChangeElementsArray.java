package school.lesson2;

public class ChangeElementsArray {

    public static int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

    public static void changeElements(){

        System.out.print("before ");            //for demonstration
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }

        System.out.print("\nafter ");           //for demonstration
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

            if(i == arr.length-1) {
                System.out.print("\n");
            }
        }
    }
}
