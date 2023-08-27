package GroupExercise;

public class GroupExercise3 {
    public static void main(String[] args) {
        int[][] numbers = {{20, 21, 22, 50, 45},
                           {11, 13, 18, 60, 19},
                           {46, 77, 29, 54, 34}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }
    }}
