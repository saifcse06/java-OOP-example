import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class OopExampleClass {
    public static void main(String[] args) {
        System.out.println("Welcome in programming world !!!");
        OopExampleClass outPut = new OopExampleClass();
       // outPut.designPattern();
        //System.out.println(outPut.duplicates(new int[] {0,3,1,2}, 4));
//        System.out.println(outPut.duplicates(new int[] {2,3,1,2,3}, 5));

       // System.out.println(outPut.missingNumber(new int[] {1, 2, 3, 5},5));
       // System.out.println(outPut.missingNumber(new int[] {6,1,2,8,3,4,7,10,5},10));
       // System.out.println(outPut.missingNumber(new int[] {1},2));
      //  System.out.println(outPut.missingNumber(new int[] {2},2));
        //System.out.println(outPut.findMaxNumber(new int[] {65, 10, 20, 15}));
        //System.out.println(outPut.decodeArray2(new int[] { 0, -3, 0, -4, 0 }));
       // System.out.println(outPut.largestPrimeFactor(10));

        /* System.out.println(outPut.isSequencedArray( new int[] {1,3,4,2,5},1,5));
        System.out.println(outPut.isSequencedArray( new int[] {1,2,3,4,5},1,5));
        */

         /*System.out.println(outPut.countPairs(new int[] {-1, 1, 2, 3, 1},2));
         System.out.println(outPut.countPairs(new int[] {-6,2,5,-2,-7,-1,3},-2));*/

        /*System.out.println(outPut.checkConcatenatedSum(198, 2));
        System.out.println(outPut.checkConcatenatedSum(198, 3));
        System.out.println(outPut.checkConcatenatedSum(2997, 3));
        System.out.println(outPut.checkConcatenatedSum(2997, 2));
        System.out.println(outPut.checkConcatenatedSum(13332, 4));
        System.out.println(outPut.checkConcatenatedSum(9, 1));*/

        /*
        outPut.largestAdjustmentSum(new int[]{1, 2, 3, 4});
        outPut.largestAdjustmentSum(new int[]{18, -12, 9, -10});
        outPut.largestAdjustmentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1});
        outPut.largestAdjustmentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1});
        */

        /*int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        length = outPut.removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");*/
       // System.out.println(isMeera(new int[] {7,6,0,10,1}));
        //System.out.println(isMeera(new int[] {6,11,10}));
//        System.out.println(isMeera(new int[] {7,6,10}));
      //  outPut.arrayBasic();
       // System.out.println(isStepped(new int[] { 1, 1, 1, 5, 5, 5,8,8,8 }));
       // System.out.println(isStepped(new int[] { 1, 1, 5, 5, 5, 5,8,8,8 }));
       // System.out.println(isStepped(new int[] { 5, 5, 5,15 }));

        int[] array1 = {1, 1, 1, 5, 5, 5, 5, 8, 8, 8};
        int[] array2 = {1, 1, 5, 5, 5, 5, 8, 8, 8};
        int[] array3 = {5, 5, 5, 15};
        int[] array4 = {3, 3, 3, 2, 2, 2, 5, 5, 5};
        int[] array5 = {1, 1, 1};
        int[] array6 = {1, 1, 1, 1, 1, 1, 1};
        int[] array7 = {3, 3, 3, 2, 2, 2, 1, 1, 1};
      /*  System.out.println(isStepped1(array1)); // Output: 1
        System.out.println(isStepped1(array2)); // Output: 0
        System.out.println(isStepped1(array3)); // Output: 0
       System.out.println(isStepped1(array4)); // Output: 0
        System.out.println(isStepped1(array5)); // Output: 1
       System.out.println(isStepped1(array6)); // Output: 1
         System.out.println(isStepped1(array7)); // Output: 1*/
        System.out.println(isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
        System.out.println(isOnionArray(new int[] { 1, 2, 3, 4, 15 }));
        System.out.println(isOnionArray(new int[] { 1, 3, 9, 8 }));
        System.out.println(isOnionArray(new int[] { 2 }));
        System.out.println(isOnionArray(new int[] {}));
        System.out.println(isOnionArray(new int[] { -2, 5, 0, 5, 12 }));
    }

    /**
     * 
     * @param a
     * @return
     */
    static int isOnionArray(int[] a) {
        if (a.length < 2) {
            return 1;
        }
        int j = 0, k = a.length - 1;
        while (j < k) {
            if (a[j] + a[k] > 10 && j + k == a.length - 1) {
                return 0;
            }
            j++;
            k--;
        }
        return 1;
    }
    static int isStepped1(int[] a) {
        int ans = 1;
        for (int i = 0; i < a.length;) {
            int count = 0;
            int j = i;
            while (j < a.length) {
                if (a[i] == a[j]) {
                    count++;
                    j++;
                } else if (a[i] > a[j]) {
                    ans = 0;
                    return ans;
                } else {
                    break;
                }
            }
            if (j == i) {
                j++;
            }
            if (count < 3) {
                ans = 0;
                break;
            }
            i = j;

        }
        return ans;
    }

    static int isStepped(int[] a){
        int n = a.length;

        // Check if the array is empty or has less than 3 elements
        if (n < 3) {
            return 0;
        }

        int distinctCount = 1; // Count of distinct values
        int consecutiveCount = 1; // Count of consecutive occurrences

        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return 0; // Not in ascending order
            }

            if (a[i] != a[i - 1]) {
                distinctCount++;
                consecutiveCount = 1;
            } else {
                consecutiveCount++;
            }

            if (consecutiveCount >= 3) {
                // There are 3 or more consecutive occurrences of a distinct value
                continue;
            } else if (distinctCount > 1) {
                // There are less than 3 consecutive occurrences of a distinct value
                return 0;
            }
        }

        return 1;
    }
    static int repsEqual(int[] a, int n) {

        for (int i = a.length - 1; i >= 0; i--) {
            int temVal = n % 10;
            n /= 10;
            if (a[i] != temVal) {
                return 0;
            }
        }
        if (n != 0) {
            return 0;
        } else {
            return 1;
        }

    }


    public void arrayBasic(){
        int[] arr = new int[] {22,14,7,90};
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (maxNum<arr[j]){
                    maxNum = arr[j];
                }
            }
        }

        /*int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length-1-i];
        }*/

        System.out.println("Output:"+maxNum);
//        System.out.println("Output:"+Arrays.toString(reverseArray));
        //return false;
    }

    public static int isMeera(int[] a){
        int zeroThere =0,isPrimeThere=0,flag=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                zeroThere++;
            }else {
                for (int j = 2; j*j < a[i]; j++) {
                    if (a[i]%j ==0){
                        flag =1;
                        break;
                    }
                }
            }
            if (flag ==0){
                isPrimeThere++;
            }
        }
        if (zeroThere >= 0 && isPrimeThere >= 0){
            return 1;
        }
        return 0;
    }

     public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

        public void designPattern(){
        //Initialize array
        int [] arr1 = new int [] {2,4,6,8,9,4,8};
       // int [] arr2 = new int [] {2,4,6,8,10,12};

         int n =7-1,j=0;

        int[] temp = new int[arr1.length];

        for (int i = 0; i <n ; i++) {
            if (arr1[i]!= arr1[i+1]){
                temp[j++] = arr1[i];
            }
        }
        temp[j++] = arr1[n];
        for (int i = 0; i < j; i++) {
            arr1[i]=temp[i];
        }

        for (int i=0; i<j; i++)
            System.out.print(arr1[i]+" ");

        //System.out.println("Smallest element present in given array: " +  misNum);
      System.out.println("Smallest element present in given array: " + Arrays.toString(arr1));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        int count=0;

        ArrayList<Integer> dup = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]){
                dup.add(arr[i]);
                count++;
            }

        }
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(dup);
        dup.clear();
        dup.addAll(set);

        if(count ==0)
        {
            dup.add(-1);
            return dup;
        }

        return dup;
    }

    public int[] twoRepeated(int arr[], int N)
    {
        int ans[]=new int[2];
        int n=0;
        int k=0;

        for(int i=0;i<N+2;i++)
        {
            n=Math.abs(arr[i]);
            if(arr[n]<0)
            {
                ans[k]=n;
                k++;
            }

            else
                arr[n]=-arr[n];
        }
        return ans;
    }
    int missingNumber(int array[], int n) {
        int missingNumber = (n*(n+1)/2);
       for (int i = 0; i < array.length; i++) {
             missingNumber = missingNumber - array[i];
        }
        return missingNumber;
    }
    public int findMaxNumber(int[] n){
        int maxNumber = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i]>maxNumber){
                maxNumber = n[i];
            }
        }
        return maxNumber;
    }
    public int decodeArray2(int[] a) {
        String res = "";
        for (int i = 1; i < a.length; i++) {
            res += Math.abs(a[i - 1] - a[i]);
        }
        if (a[0] < 0) {
            res = "-" + res;
        }
        return Integer.valueOf(res);
    }
    public int largestPrimeFactor(int number) {
        int largestPrimeNumber = 2;
        if (number <= 1) {
            return 0;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && isPrime(i)) {
                largestPrimeNumber = i;
            }
        }
        return largestPrimeNumber;
    }

    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 0;
    }

    public boolean isSequencedArray(int[] a, int m, int n) {
        if (a.length <= 1 || a[0] != m || m > n || a[a.length - 1] != n) {
            return false;
        }
        for (int i = m; i < n; i++) {
            boolean flag = false;
            for (int j = 1; j < a.length-1; j++) {
                if (a[j - 1] > a[j]) {
                    return false;
                }
                if (a[j-1] == i || a[j] == i){
                    flag = true;
                    break;
                }

            }
            if (!flag){
                return false;
            }
        }
        return true;
    }

    public int countPairs(int[] nums, int target) {
        int indexCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sumResult = nums[i] + nums[j];
                if (sumResult < target) {
                    indexCount++;
                }
            }
        }
        return indexCount;
    }

    /**
     *
     * @param number
     * @param catlen
     * @return
     */
    public boolean checkConcatenatedSum(int number, int catlen) {
        int sumResult = 0, copyNumber = number;
        while (number > 0) {
            int rem = number % 10;
            int catValue = 0;
            for (int i = 0; i < catlen; i++) {
                catValue = catValue * 10 + rem;
            }
            sumResult += catValue;
            number /= 10;
        }
        return sumResult == copyNumber ? true : false;
    }

    private void largestAdjustmentSum(int[] i) {
        int sumLargeResult = 0;
        for (int j = 0; j < i.length - 1; j++) {
            if (sumLargeResult < i[j] + i[j + 1]) {
                sumLargeResult = i[j] + i[j + 1];
            }
        }
        System.out.println(sumLargeResult);
    }
}

