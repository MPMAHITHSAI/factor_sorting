package Factoresshort;

import java.util.*;

public class Facsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (factor_count(array[j]) > factor_count(array[j+1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static int factor_count(int number) {
        int count=0;
        for(int i=1;i<Math.sqrt(number);i++){
            if(number%i==0){
                count++;
            }
        }
        return count;
    }

}