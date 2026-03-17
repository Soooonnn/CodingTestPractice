import java.util.HashSet;
import java.util.Set;

class Solution {
    private HashSet<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        recursive("", numbers);

        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    private void recursive(String comb, String others) {
        if (!comb.equals("")) {
            numberSet.add(Integer.valueOf(comb));
        }

        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), 
                      others.substring(0, i) + others.substring(i + 1));
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}