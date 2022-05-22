package school.lesson2;

public class ArrayShift {

    public static void shift(int[] array, int k) {

        if(k>0){
            for (int i = 0; i < k; i++) {
                int temp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--)
                    array[j] = array[j - 1];
                array[0] = temp;
            }
        }if(k<0){
            for (int i = 0; i < Math.abs(k); i++) {
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++)
                    array[j] = array[j + 1];
                array[array.length - 1] = temp;
            }
        }

        for(int i =0; i < array.length; i++){
            System.out.print(array[i]);
            if(i == array.length-1) {
                System.out.print("\n");
            }
        }
    }
}
