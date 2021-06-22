import java.util.Arrays;

public class lesson3_v1 {
    public static void main(String args[]){
        one();
        System.out.println();
        two();
        System.out.println();
        three();
        System.out.println();
        System.out.println();
        four();
        System.out.println();
        five(5,37);
        System.out.println();
        six();
        System.out.println();
        System.out.println(seven());
        System.out.println();
        eight();

    }

    public static void one(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
            System.out.println(Arrays.toString(arr));
    }

    public static void two() {
        int[] arr = new int[100];
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void three(){

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
                System.out.print(arr[i] + " ");
            }
    }

    public static void four() {
        int[][] arr = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1}
        };
        for (int y = 0; y < arr.length; y++){
            for (int x = 0; x < arr[y].length; x++){
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }
    }



    public static void five(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void six(){
        int[] arr = {2, 34, 53, 1, 4, 42, 21, 5};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static boolean seven(){
        int[] arr = {3, 5, 1, 4, 5};

        int right = 0;
        int left = 0;

        for (int i = 0; i < arr.length; i++){
            right += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            if (left == right - left){
                return true;
            }
        }
        return false;
    }

    public static void eight(){

        int n = 1;

        int[] arr = new int [4];
        int[] arr1 = new int [4 + n];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 4;
        arr[3] = 1;


        for (int i = 0; i < arr.length; i++){
            arr1[i + n] = arr[i];
            arr[i] = arr1[i];
            System.out.print(arr[i]);
        }

    }







}
