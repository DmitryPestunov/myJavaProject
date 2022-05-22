package school.lesson2;

public class MultiplicationLessSix {

    static int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

    public static void mul(){
        System.out.print("before ");            //for demonstration
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<6){
                arr[i]*=2;
            }

            if(arr[i] == arr.length-1){
                System.out.print("\n");
            }
        }

        System.out.print("after ");            //for demonstration
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

            if(i == arr.length-1) {
                System.out.print("\n");
            }
        }
    }
}
