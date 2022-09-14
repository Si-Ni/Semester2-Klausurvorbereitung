public class Bubblesort {

    public static int[] randomNumberArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };
    public static int[] sort() {
        for (int i = randomNumberArr.length; i > 1; --i) {
            boolean swapped = false;
            for (int j = 0; j < i-1; ++j) {
                if(randomNumberArr[j] > randomNumberArr[j+1]) {
                    swapped = true;
                    int temp = randomNumberArr[j];
                    randomNumberArr[j] = randomNumberArr[j + 1];
                    randomNumberArr[j + 1] = temp;
                }
            }
            for (int x = 0; x < randomNumberArr.length; x++) {
                System.out.print(String.valueOf(randomNumberArr[x]) + ", ");
            }
            System.out.println("");
            if(!swapped) {
                break;
            }
        }
        return randomNumberArr;
    }

    public static void main(String[] args) {
        int[] sortedArr = Bubblesort.sort();
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(i + 1 + ": " + String.valueOf(sortedArr[i]));
        }
    }
}