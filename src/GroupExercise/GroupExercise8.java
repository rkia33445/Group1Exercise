package GroupExercise;

public class GroupExercise8 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int[][] numbers = {{3,7,8,4,9},
                           {1,2, 18, 6, 19},
                           {46, 77, 29, 14, 34}};
        int maximum = numbers[0][0];
        int minimum = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j]>maximum) {
                   maximum=numbers[i][j];

                } else if(numbers[i][j]<minimum) {
                    minimum=numbers[i][j];
                }
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }}
