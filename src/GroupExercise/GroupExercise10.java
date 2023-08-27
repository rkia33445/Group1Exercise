package GroupExercise;

public class GroupExercise10 {
    public static void main(String[] args) {
        // Write a program to print out duplicate
        // elements from an Array of Strings?
        String[] strings = {
                "Horse", "Rabbit", "Cat", "aLion", "Deer",
                "Bear", "Cat", "Fox", "Tiger", "Duck"};

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println(strings[j]);
    }
}


    }}}
