package GroupExercise;

public class GroupExercise1 {
    public static void main(String[] args) {
        int[] temperatures = {21, 20, 19, 50, 45, 10, 17};
        int highest = temperatures[0];
        int smallest = temperatures[0];
        for (int n : temperatures) {
            if (n < smallest) {
                smallest = n;
            } else if (n > highest) {
                highest = n;
            }
            }
            System.out.println("the lowest temperature is " + smallest + " °C");
            System.out.println("the highest temperature is " + highest + " °C");
        }
    }
