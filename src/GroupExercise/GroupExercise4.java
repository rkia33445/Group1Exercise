package GroupExercise;

public class GroupExercise4 {
    public static void main(String[] args) {
        //4. Create a 2D array of integers. Develop a program which will calculate
        //the sum of even and odd numbers for that array
        int[][] numbers = {{3,7,8,4,9},
                           {1,2, 18, 6, 19},
                           {46, 77, 29, 14, 34}};
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                   evenSum+=numbers[i][j];

                } else  {
                    oddSum+=numbers[i][j];
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }}
