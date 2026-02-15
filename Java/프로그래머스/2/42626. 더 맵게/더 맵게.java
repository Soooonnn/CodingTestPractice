import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilleQ = new PriorityQueue<>();
        for(int s:scoville){
            scovilleQ.add(s);
        }
        while(scovilleQ.peek() < K){
            if(scovilleQ.size()<2){
                return -1;
            }
            int least_hot = scovilleQ.poll();
            int s_least_hot = scovilleQ.poll();
            scovilleQ.add(least_hot+(s_least_hot*2));
            answer++;
        }

        return answer;
    }
}