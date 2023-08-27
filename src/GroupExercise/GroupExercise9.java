package GroupExercise;

public class GroupExercise9 {
    public static void main(String[] args) {
        //  Write a java program to find the second largest number in the array?
        int[][] numbers = {{3,7,8,4,9},
                           {1,2, 18, 6, 19},
                           {46, 77, 29, 14, 84}};
        int largestNum=numbers[0][0];
        int secondLargest=numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > largestNum) {
                    secondLargest = largestNum;
                    largestNum = numbers[i][j];
                } else if (numbers[i][j] > secondLargest && numbers[i][j] < largestNum) {
                    secondLargest = numbers[i][j];
                }
            }
        }
        System.out.println(secondLargest);

    }}
