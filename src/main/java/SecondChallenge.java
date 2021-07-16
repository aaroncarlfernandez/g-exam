import java.util.Arrays;

public class SecondChallenge {

    public boolean isAnagram(String input1, String input2) {
        if (input1.length()!=input2.length()) return false;

        char[] charArray1 = input1.toCharArray();
        char[] charArray2 = input2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
