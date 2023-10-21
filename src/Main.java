import array.ArrayChallenges;
import array.ArrayTraverse;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello  welcome to java array !");
        String[] employeeName = {"Galu", "Gugi", "koko", "Shree", "sony"};
        ArrayTraverse obj = new ArrayTraverse();
        obj.getArrayValue();
        obj.getArrayValue("bhairab");
        obj.getEmployeeName(employeeName);

        // Array Challenges
        ArrayChallenges arrayChallenges = new ArrayChallenges();
        arrayChallenges.findMinMax();
        arrayChallenges.mergeArray();
        arrayChallenges.sortArray();
        arrayChallenges.duplicate();
        arrayChallenges.missingNumberArray();


    }
}