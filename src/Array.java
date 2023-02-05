import java.util.Scanner;

public class Array {

    public static void sortArray(int[] myArr, int arrSize) {
        for(int i = 0; i < arrSize - 1; ++i) {
            boolean swap = false;

            for(int j = 0; j < arrSize - i - 1; ++j) {
                if (myArr[j] < myArr[j + 1]) {
                        int temp = myArr[j];
                        myArr[j] = myArr[j + 1];
                        myArr[j + 1] = temp;
                        swap = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userNum = new int[20];
        System.out.print("Enter length of the array: ");
        int numVal = sc.nextInt();

        int i;
        for(i = 0; i < numVal; ++i) {
            int userInput = sc.nextInt();
            userNum[i] = userInput;
        }

        sortArray(userNum, numVal);

        for(i = 0; i < numVal; ++i) {
                System.out.println(userNum[i] + ",");
        }

    }

}
