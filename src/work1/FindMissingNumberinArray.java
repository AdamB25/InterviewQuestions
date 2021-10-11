package work1;

import java.util.*;

public class FindMissingNumberinArray {
   static int size;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        size=scanner.nextInt();
        int [] A =new int[size];
        Random random=new Random();
        for (int i = 0; i < size; i++) {
         A[i]=random.nextInt(size)+1;

        }
        System.out.println("My Array is " + Arrays.toString(A));
        List<Integer> missingnumbers= findMissingNumbers(A);
        System.out.println("missingnumbers = " + missingnumbers);
    }

    private static List<Integer> findMissingNumbers(int[] a) {
       List<Integer> missingsNumber=new ArrayList<>();

       for (int i = 1; i < size+1; i++) {
           int count=0;
            for (int j=0;j<a.length;j++){

                if (i==a[j]){
                    count++;
                }
            }

            if (count==0){
                missingsNumber.add(i);
            }

        }
       return missingsNumber;
    }

}
