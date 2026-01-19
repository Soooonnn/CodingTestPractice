import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(answer.isEmpty() || answer.get(answer.size()-1) != arr[i]){
                answer.add(arr[i]);
            }
        }
        int[] real_answer = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            real_answer[i] = answer.get(i);
        }
        
        return real_answer;
    }
}