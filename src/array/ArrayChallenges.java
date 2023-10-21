package array;

import java.util.Arrays;

public class ArrayChallenges {

    //Find min and max for array


    int[] sort = {3, 1, 0, 43, -13, 95};
    int temp;
    int[] a = {2, 3, 9, 4, 1, 5};
    int[] b = {0, 3, 1, 43, 13, 95};
    int[] c = new int[a.length + b.length];


    //Find max and min in array of elements
    int[] sal = {20, 30, 19, 40, -1, 55};
    public void findMinMax() {
        int max=sal[0];
        int min = sal[0];
        for(int key=0;key < sal.length ; key++){
                if(sal[key] < min){
                    min = sal[key];
                }
                if(sal[key] > max){
                    max= sal[key];
                }
        }
        System.out.println(min + "-----------" + max);
//        System.out.println(Arrays.stream(sal).max());
//        System.out.println(Arrays.stream(sal).min());
//        System.out.println(Arrays.stream(sal).average());
    }


    //Merge two unsorted array
    public void mergeArray() {
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        System.out.println(Arrays.toString(c));

        for (int j = 0; j < b.length; j++) {
            c[j + a.length] = b[j];
        }
        System.out.println(Arrays.toString(c));
        System.out.println(c.length);
    }


    //Write a program to sort an array

    public void sortArray() {
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0 + i; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }

        }
        System.out.println("New Sorted array" + Arrays.toString(sort));
    }

    int[] dupArray = {3, 1, 1, 43, 43, 95};
    int[] newArray;

    public void duplicate() {
        for (int i = 0; i < dupArray.length; i++) {
            for (int j = 1 + i; j < dupArray.length; j++) {
                if (dupArray[i] == dupArray[j]) {
                    System.out.println(dupArray[i]);
                }
            }

        }
    }

    int[] missingArray = {1, 2, 3, 4, 5, 6, 9, 10};

    public void missingNumberArray() {
        for (int i = 1; i <= 10; i++) {
            boolean isPresent = check(missingArray, i);
            if (isPresent == false) {
                System.out.println("The missing number is :-" + i);
            }
        }
    }

    private  boolean check(int[] missingArray, int i) {
        for (int key = 0; key < missingArray.length; key++) {
            if (missingArray[key] == i ) {
                return true;
            }
        }
        return false;
    }
}
