package qustion1;

import java.util.ArrayList;
import java.util.Arrays;

public class qustion1 {
    public static int[] insertAt(int[] arr, int ele, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int j = 0; j < newArr.length; j++) {
            if (j < pos) {
                newArr[j] = arr[j];
            } else if (j == pos) {
                newArr[j] = ele;
            } else {
                newArr[j] = arr[j - 1];
            }
        }
        return newArr;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] findPrime(int[] arr) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes.stream()
                .mapToInt(num -> num.intValue())// Integer::intvalue ==> Reference method
                .toArray();
    } public static int[][][] getFactors(int[] arr) {
        int[][][] result = new int[arr.length][][];

        for (int i = 0; i < arr.length; i++) {
            ArrayList<int[]> factors = new ArrayList<>();

            for (int j = 1; j <= Math.abs(arr[i]); j++) {
                if (arr[i] != 0 && arr[i] % j == 0) {
                    int evenOrOdd = (j % 2 == 0) ? 1 : 0;
                    factors.add(new int[]{j, evenOrOdd});
                }
            }

            result[i] = factors.toArray(new int[0][]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 5};
        int[] result = insertAt(arr, 10, 2);
        System.out.println(Arrays.toString(result));
        int[] arr2 = {1, 2, 4, 5, 7, 9, 11, 15};
        int[] result2 = findPrime(arr2);
        System.out.println(Arrays.toString(result2));
        int[] arr3 = {6, 3};

        int[][][] result3 = getFactors(arr3);

        System.out.println(Arrays.deepToString(result3));
    }

}
