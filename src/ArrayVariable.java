import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayVariable {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 7, 1, 4, 0};
        System.out.print("\nnumbers not ordered : [");

        Arrays.stream(numbers).forEach(x -> {
            System.out.print(x + ",");
        });
        System.out.print("]\n");

        /**
         * Order vector
         */
        Arrays.sort(numbers);

        System.out.print("numbers ordered : [");
        for (int x : numbers
        ) {
            System.out.print(x + ",");
        }
        System.out.print("]\n");
        System.out.println("numbers = " + Arrays.stream(numbers).sum());
        /**
         * reverse a vector
         */
        System.out.println("Reverse a vector");
        for (int i = numbers.length; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
                System.out.print("]");
            } else if (i == numbers.length) {
                System.out.print("[");
            } else {
                System.out.print(numbers[i] + ",");
            }
        }
        /**
         * Burbuge method
         */
        int [] numbers2 = {4,1,7,2,6};
        System.out.print("\nBurbugle method\nnumbers2 not ordered : [");
        for (int x : numbers2
        ) {
            System.out.print(x + ",");
        }
        System.out.print("]\n");
        int length = numbers.length-1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(numbers2[i] < numbers2[j]){
                    int aux = numbers2[i];
                    numbers2[i] = numbers2[j];
                    numbers2[j] = aux;
                }
            }
        }
        System.out.print("numbers2 ordered : [");
        for (int x : numbers2
        ) {
            System.out.print(x + ",");
        }
        System.out.print("]\n");



    }
}
