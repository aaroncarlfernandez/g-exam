import java.util.HashSet;
import java.util.Set;

public class ThirdChallenge {

    public boolean isZeroSumExists(int[] input) {
        int sum = 0;
        Set<Integer> sumSet = new HashSet<>();

        for (int i=0; i<input.length; i++) {
            sum+=input[i];
            if (sumSet.contains(sum)) return true;
            sumSet.add(sum);
        }

        return false;
    }
}
