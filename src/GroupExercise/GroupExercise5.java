package GroupExercise;

public class GroupExercise5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable?

      int first=40;
      int second=50;
        System.out.println("Before swap");
        System.out.println("First value :"+first);
        System.out.println("Second value :"+second);

        first =first - second;
        second =first + second;
        first =second - first;
      System.out.println("After swap");
        System.out.println("First value :"+first);
      System.out.println("Second value :"+second);


    }
}
