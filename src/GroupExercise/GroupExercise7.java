package GroupExercise;

public class GroupExercise7 {
    public static void main(String[] args) {
        // Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n = 10;
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
            }



