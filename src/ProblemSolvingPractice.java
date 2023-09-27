public class ProblemSolvingPractice {
    public static void main(String[] args) {
//        System.out.println(findMaxMin(new int[] {5,3,1,4,2}));
//        System.out.println(isOddHeavy(new int[] {-2, -4, -6, -8, -11}));
//        System.out.println(countDigit(-543, 3));
//        System.out.println(isBunkerArray(new int[] {4, 9, 6, 7, 3}));
//        System.out.println(Arrays.toString(fill(new int[]{1, 2, 3, 5, 9, 12, -2, -1}, 3, 10)));
//        System.out.println(isEvenSpaced(new int[]{200, 10, 151, 160}));
//        System.out.println(isSym(new int[]{2, 7, 8, 9, 11, 13, 10}));
//        System.out.println(isOddHeavy2(new int[] {11, 4, 9, 2, 8}));
//        System.out.println(isDivisible(new int[] {},12));
//        System.out.println(numberOfEmployeesWhoMetTarget(new int[] {5,1,4,2,2},6));
//        System.out.println(isSquare(8));
//        System.out.println(isStacked(10));
//        System.out.println(isIsolated(161));
//        System.out.println(repsEqual(new int[] {0, 3, 2, 0, 5, 3},32053));
//        System.out.println(Arrays.toString(clusterCompression(new int[] {8, 8, 6, 6, -2, -2, -2})));
//        System.out.println(isDual(new int[] {0, 3, 2, 0, 5, 3}));
//        System.out.println(isCentered(new int[] {3, 2, 1, 4, 5}));
//        System.out.println(isZeroPlentiful(new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
//        System.out.println(guthrieIndex(42));
//        System.out.println(isVanilla(new int[] {9, 999, 99999, -9999}));
//        System.out.println(isVanilla(new int[] {11, 22, 13, 34, 125}));
//        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
        System.out.println(stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
    }
    static int stantonMeasure(int[ ] a){
        int count = 0,tempCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                count++;
            }
        }
        int stantonMeasureCount = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == count){
                stantonMeasureCount++;
            }
        }
        return stantonMeasureCount;
    }
    static int sumFactor(int[]  a){
        if (a.length<1){
            return 0;
        }
        int sum=0,count =0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int j = 0; j < a.length; j++) {
                if (sum == a[j]){
                    count++;
                }
        }
        return count;
    }
    static int primeCount(int start, int end){
        int count=0;
        for (int i = start; i <= end; i++) {
            if (i%2!=0&&isPrime(i)){
                count++;
            }
        }
        return count;
    }
    static int isVanilla(int[] a)
    {
        int rtnVal = 1,rem=0,n=0,flag=0;
        if(a.length>0)
            flag = a[0] % 10;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
                a[i] = -1 * a[i];
            n = a[i];
            while(n!=0)
            {
                rem = n % 10;
                n = n / 10;
                if(flag!=rem)
                {
                    rtnVal = 0;
                    break;
                }
            }
        }
        return rtnVal;
    }
    static int guthrieIndex(int n)
    {
        int rtnVal = 0;
        while(n!=1)
        {
            if (n % 2 == 0)//Even
            {
                n = n / 2;
                rtnVal++;
            }
            else
            {
                n = ((n * 3) + 1);
                rtnVal++;
            }
        }
        return rtnVal;

    }
    static int isZeroPlentiful(int[] a)
    {
        if (a.length<1){
            return 0;
        }
        int countZero = 0,count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                countZero++;
            }else {
                countZero =0;
            }
            if (countZero>=4){
                if (a.length != i+1){
                    if (a[i] != a[i+1]){
                        count++;
                    }
                }else {
                    count++;
                }
            }
        }

        return count;
    }
    static   int isCentered(int[] a)
    {
        int n = a.length;

        // Check if the array is empty or has an even number of elements
        if (n == 0 || n % 2 == 0) {
            return 0;
        }

        int middleIndex = n / 2;
        int middleValue = a[middleIndex];

        // Check if the middle element is strictly less than all other elements
        for (int i = 0; i < n; i++) {
            if (i != middleIndex && a[i] <= middleValue) {
                return 0;
            }
        }

        return 1;
    }
    static int isDual(int[] a)
    {
        if (a.length>1){
            if (a.length % 2 ==0){
                for (int i = 2; i < a.length; i=i+2) {
                    if (a[0]+a[1]!=a[i]+a[i+1]){
                        return 0;
                    }
                }
            }else {
                return 0;
            }
        }
        return 1;
    }
    static int[] clusterCompression(int[] a)
    {
        int[] newArry = new int[FindCompressedArrayCount(a)];
        int j=0;
        int currentValue=a[0];
        newArry[j]=currentValue;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=currentValue){
                j++;
                newArry[j] = a[i];
                currentValue = a[i];
            }
        }
        return newArry;
    }
    static int  FindCompressedArrayCount(int[] a)
    {
        int count=1,currentValue= a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=currentValue){
                count++;
                currentValue=a[i];
            }
        }
        return count;
    }
    static int repsEqual(int[] a, int n)
    {
        int result = 1, remain = 0;
        for (int i = a.length - 1; i > 0; i--) {
            remain = n % 10;
            if (n == 0) {
                if (a[i] != 0) {
                    return 0;
                } else {
                    continue;
                }
            }
            n /= 10;
            if (i == 0 && n != 0) {
                return 0;
            }
            if (a[i] != remain) {
                return 0;
            }
        }

        return result;
    }
    static int isIsolated(long n) {
        long square = 0, cube = 0,rem=0,remSquare=0,temSquare=0;
        int rtnVal = 1;
        if(n<=2097151)
        {
            square = n * n;
            cube = n * n * n;

            while(cube!=0)
            {
                temSquare = square;
                rem = cube% 10;
                cube = cube / 10;
                while (temSquare != 0)
                {
                    remSquare = temSquare % 10;
                    temSquare = temSquare / 10;
                    if(rem==remSquare)
                    {
                        rtnVal = 0;
                    }
                }
            }
        }
        else
        {
            rtnVal = 0;
        }
        return rtnVal;
    }
    static int isStacked(int n){
        int sum=0,result=0;
        for (int i = 0; i < n; i++) {
            sum += i;
            if (sum == n){
                result = 1;
                break;
            }
        }
        return result;
    }
    public static   int isSquare(int n){
        int i=0;
        while (n>0){
            if (i*i == n){
                return 1;
            }
            i++;
        }
        return 0;
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int countEmp = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target){
                countEmp++;
            }
        }
        return countEmp;
    }
    static int isDivisible(int[] a, int divisor){

        for (int i = 0; i < a.length; i++) {
            if (a[i]%divisor != 0){
                return 0;
            }
        }

        return 1;
    }
    static int isOddHeavy2(int[ ] a){
       // int odd
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 !=0){
                for (int j = 0; j < a.length; j++) {
                    if (a[j]%2==0 && a[j]>a[i]){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
    static  int isSym (int [ ] a){
        int result=0;
        if (a.length<1){
            return 0;
        }
        for (int i = 0,j=a.length-1; i < a.length && j>0; i++,j--) {
            if ((a[i]%2==0 && a[j]%2==0) || (a[i]%2!=0 && a[j]%2!=0)){
                result = 1;
            }else {
                return 0;
            }
        }
        return result;
    }
    static int isEvenSpaced(int[] a){
        if (a.length<1){
            return 0;
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min){
                min = a[i];
            } else if (a[i]>max) {
                max = a[i];
            }
        }
        if ((min-max)%2 == 0){
            return 1;
        }
        return 0;
    }
    static int[] fill(int[] arr, int k, int n){
        int[] arr1 = new int[k];
        int[] finalArray = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(k>0)
            {
                finalArray[i] = arr[j];
                j++;
                if(j>=k)
                {
                    j = 0;
                }
            }
            /*if (k <= j){
                j=0;
            }
            if (j<k){
                finalArray[i] = arr[j];
            }

            j++;*/
        }
/*
        for (int i = 0; i < k; i++) {
            arr1[i] = arr[i];
        }

        int tempIndex =0;
        for (int j = 0; j < finalArray.length; j++) {
            if (tempIndex==k){
                tempIndex =0;
            }
            finalArray[j]=arr1[tempIndex++];
        }*/

        return finalArray;
    }
    static int isBunkerArray(int[] a){
        if (a.length == 0){
            return 0;
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0 && isPrime(a[i])){
                return 1;
            }
        }
        return 0;
    }
    static boolean isPrime(int n){
        for (int i = 2; i < n ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return n>0;
    }
    static int countDigit(int n, int digit){
        int count=0;
        if (n < 0 || digit < 0)
        {
            return  -1;
        }
        while (n >0){
            int rem = n %10;
            if (rem == digit){
                count++;
            }
            n/=10;
        }
        return count;
    }
    static int isOddHeavy(int[] a){
        int retVal = 1;
        if (a.length == 0){
            return 0;
        } else if (a.length == 1 && a[0]%2 ==0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                for (int j = 0; j < a.length; j++) {
                    if (a[j]%2 == 0 && a[i]<a[j]){
                        return 0;
                    }
                }
            }
        }

        return 1;
    }

    static int findMaxMin(int[] a) {
        int minNumber = a[0];
        int maxNumber = a[0];
        int maxCount = 0;
        int minCount = 0;
        int adjacent = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < minNumber) {
                minNumber = a[i];
            } else if (a[i] > maxNumber) {
                maxNumber = a[i];
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == maxNumber) {
                maxCount++;
            }
            if (a[j] == minNumber) {
                minCount++;
            }
            if (a[j] == maxNumber) {
                if (j != 0 && j != a.length - 1) {
                    if (a[j] + 1 == minNumber || a[j - 1] == minNumber) {
                        adjacent = 1;
                    }
                }else {
                    if (j==0){
                        if (a[j+1] == minNumber){
                            adjacent =1;
                        }
                    } else if (j==a.length-1){
                        if (a[j-1]==minNumber){
                            adjacent =1;
                        }
                    }
                }
            }
        }
        if (minNumber != maxNumber && minCount == 1 && maxCount == 1 && adjacent == 0) {
            return 1;
        }
        return 0;
    }
}
